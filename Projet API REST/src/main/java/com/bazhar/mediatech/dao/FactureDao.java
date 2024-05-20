package com.bazhar.mediatech.dao;

import com.bazhar.mediatech.models.Facture_Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureDao extends JpaRepository<Facture_Entity,Integer> {
}
