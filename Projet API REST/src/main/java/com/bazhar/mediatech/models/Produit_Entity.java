package com.bazhar.mediatech.models;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "produits")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit_Entity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String ref;
    @Column(nullable = false)
    private  String libelle;
    @Column(nullable = false)
    private BigDecimal prix;
    @Column()
    private double quantity;
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "p1")
    private List<LigneFacture_Entity> ligneFacture_entities;
}
