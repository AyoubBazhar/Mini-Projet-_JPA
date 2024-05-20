package com.bazhar.mediatech.service;

import com.bazhar.mediatech.dto.ProduitDto;

import java.util.List;
import java.util.Optional;

public interface ProduitService {

    ProduitDto save (ProduitDto produitDto) ;
    int delete(String ref);

    ProduitDto FindByRef(String ref);
    ProduitDto Update(ProduitDto produitDto);
    List<ProduitDto> findAll();

    interface FactureService {
       Optional< FactureDto> save(FactureDto factureDto);
    }
}
