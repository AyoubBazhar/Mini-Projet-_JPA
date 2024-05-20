package com.bazhar.mediatech.service.Impl;

import com.bazhar.mediatech.dao.FactureLigneDao;
import com.bazhar.mediatech.models.LigneFacture_Entity;
import com.bazhar.mediatech.service.FactureLigneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class FactureLigneServiceImpl implements FactureLigneService {
    private  final FactureLigneDao factureLigneDao;
    @Override
    public LigneFacture_Entity save(LigneFacture_Entity ligneFactureEntity) {
        return factureLigneDao.save(ligneFactureEntity);
    }

    @Override
    public List<LigneFacture_Entity> findall() {
        return factureLigneDao.findAll();
    }
}
