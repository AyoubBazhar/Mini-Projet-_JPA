package com.bazhar.mediatech.service;

import com.bazhar.mediatech.models.Facture_Entity;

import java.util.List;
import java.util.Optional;

public interface FactureService {
    Facture_Entity save(Facture_Entity factureEntity);

    List<Facture_Entity>findall();
}
