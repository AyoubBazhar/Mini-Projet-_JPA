package com.bazhar.mediatech.service.Impl;

import com.bazhar.mediatech.Exceptions.EntityNotFoundException;
import com.bazhar.mediatech.dao.ProduitDao;
import com.bazhar.mediatech.dto.ProduitDto;
import com.bazhar.mediatech.models.Produit_Entity;
import com.bazhar.mediatech.service.ProduitService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProduitServiceImpl implements ProduitService {

    private final ProduitDao produitDao;
    private final  ModelMapper modelMapper;


    @Override
    public ProduitDto save(ProduitDto produitDto) {
        if(FindByRef(produitDto.getRef()) != null) throw new EntityNotFoundException("Client not found");
        Produit_Entity produitEntity = modelMapper.map(produitDto, Produit_Entity.class);
        Produit_Entity savedProduit = produitDao.save(produitEntity);
        return modelMapper.map(savedProduit, ProduitDto.class);
    }




   @Transactional
    @Override
    public int delete(String ref) {
        return produitDao.deleteByRef(ref);
    }


    @Override
    public ProduitDto FindByRef(String ref) {
        Produit_Entity produitEntity = produitDao.findByRef(ref).orElse(null);
        if (produitEntity == null) throw new EntityNotFoundException("Client not found");
        return modelMapper.map(produitEntity, ProduitDto.class);
    }

    @Override
    public ProduitDto Update(ProduitDto produitDto) {
        Optional<Produit_Entity> produitEntity = produitDao.findByRef(produitDto.getRef());
        if (produitEntity.isEmpty()) throw new EntityNotFoundException("Client not found");
        update(produitEntity.get(), produitDto);
        Produit_Entity saved = produitDao.save(produitEntity.get());
        return modelMapper.map(saved, ProduitDto.class);
    }



    private void update(Produit_Entity produitEntity, ProduitDto produitDto) {
        produitEntity.setLibelle(produitDto.getLibelle());
        produitEntity.setPrix(produitDto.getPrix());
        produitEntity.setQuantity(produitDto.getQuantity());

    }

    @Override
    public List<ProduitDto> findAll() {
        return produitDao.findAll()
                .stream()
                .map(el -> modelMapper.map(el, ProduitDto.class))
                .collect(Collectors.toList());
    }
}
