package com.bazhar.mediatech.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class LigneFactureKey_Entity implements Serializable {
    private static final long serialVersionUID = 123455432111L;
    @Column(name = "Facture_id")
    private Integer FactureId;
    @Column(name = "Produit_id")
    private Integer ProduitId;


}
