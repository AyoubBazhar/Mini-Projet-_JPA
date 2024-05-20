package com.bazhar.mediatech.service;

import com.bazhar.mediatech.dao.FactureDao;
import com.bazhar.mediatech.models.Facture_Entity;
import com.bazhar.mediatech.models.LigneFacture_Entity;

import java.util.List;
import java.util.Optional;

public interface FactureLigneService {
    LigneFacture_Entity save(LigneFacture_Entity ligneFactureEntity);

    List<LigneFacture_Entity> findall();
}
