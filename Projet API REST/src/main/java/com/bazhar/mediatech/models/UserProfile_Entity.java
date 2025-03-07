package com.bazhar.mediatech.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Table(name = "userprofiles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile_Entity implements Serializable {
   @Id
   @GeneratedValue
    private Integer id ;
    private String avatar;
    private String telephone;

    @OneToOne
    @JoinColumn()
    private User_Entity user1;
}
