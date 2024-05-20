package com.bazhar.mediatech.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role_Entity implements Serializable {
    @Id
    private Integer roleId;
    @Column(nullable = false)
    private String name;
    @ManyToMany
    @JoinTable(name = "User_Role", joinColumns = @JoinColumn(name = "RoleId"),inverseJoinColumns = @JoinColumn(name = "UserId"))
    private List <User_Entity> users;
}
