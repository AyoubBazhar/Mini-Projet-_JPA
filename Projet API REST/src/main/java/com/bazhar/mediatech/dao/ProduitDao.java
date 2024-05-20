package com.bazhar.mediatech.dao;

import com.bazhar.mediatech.dto.ProduitDto;
import com.bazhar.mediatech.models.Produit_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProduitDao extends JpaRepository<Produit_Entity,Integer>{

    Optional<Produit_Entity> findByRef(String ref);



    int deleteByRef(String ref);

}
