package com.bazhar.mediatech.service.Impl;

import com.bazhar.mediatech.dao.FactureDao;
import com.bazhar.mediatech.models.Facture_Entity;
import com.bazhar.mediatech.service.FactureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class FactureServiceImpl implements FactureService {
    private final FactureDao factureDao;

    @Override
    public Facture_Entity save(Facture_Entity factureEntity) {
        return factureDao.save(factureEntity);
    }

    @Override
    public List<Facture_Entity> findall() {
        return factureDao.findAll();
    }
}
