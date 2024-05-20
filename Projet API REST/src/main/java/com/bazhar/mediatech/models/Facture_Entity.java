package com.bazhar.mediatech.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "factures")
@Data
@Getter
@Setter
@ToString
public class Facture_Entity implements Serializable {

    @Id()
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String ref;
    @Column(nullable = false)
    private Date date ;
    @ManyToOne
    private Client_Entity client ;
    @OneToMany( mappedBy = "f1" ,fetch = FetchType.LAZY , cascade = CascadeType.ALL )
    private List<LigneFacture_Entity>ligneFacture_entities;

}
