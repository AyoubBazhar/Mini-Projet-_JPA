package com.bazhar.mediatech.dao;

import com.bazhar.mediatech.models.LigneFactureKey_Entity;
import com.bazhar.mediatech.models.LigneFacture_Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureLigneDao extends JpaRepository<LigneFacture_Entity, LigneFactureKey_Entity> {
}
