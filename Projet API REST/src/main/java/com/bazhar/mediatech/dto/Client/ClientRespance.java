package com.bazhar.mediatech.dto.Client;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientRespance {
    private Integer id;
    private String nom;
    private String prenom;
    private String tel;
}
