package com.bazhar.mediatech.dao;

import com.bazhar.mediatech.models.Client_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao  extends JpaRepository<Client_Entity,Integer> {

    Client_Entity findByNom(String nom);
}
