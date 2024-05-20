package com.bazhar.mediatech.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User_Entity implements Serializable {
    @Id
    private Integer UserId ;
   @Column(nullable = false)
    private  String Username;
   @Column(nullable = false)
    private String Password;


   @ManyToMany
   @JoinTable(name = "User_Role", joinColumns = @JoinColumn(name = "UserId"),inverseJoinColumns = @JoinColumn(name = "RoleId"))
    private List < Role_Entity> roles ;


   @OneToOne(mappedBy = "user1",cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
   private UserProfile_Entity profile ;
}
