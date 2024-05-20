package com.bazhar.mediatech.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client_Entity implements Serializable {
        @Id()
        @GeneratedValue
        private  Integer id;

        @Column(nullable=false)
        private String nom;
        @Column(nullable = false)
        private String prenom;
        @Column(name = "Client_tel")
        private String tel;

        @OneToMany(mappedBy = "client",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
        private List<Facture_Entity> facturez;


}
