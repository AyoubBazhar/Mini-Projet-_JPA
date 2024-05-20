package com.bazhar.mediatech.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Table(name = "lignefactures")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LigneFacture_Entity implements Serializable {
@EmbeddedId
private LigneFactureKey_Entity id;
@ManyToOne
@JoinColumn(name = "Facture_id")
@MapsId("FactureId")
private  Facture_Entity f1;
@ManyToOne
@JoinColumn(name = "Produit_id")
@MapsId("ProduitId")
    private Produit_Entity p1;


private  double Quantite ;

}
