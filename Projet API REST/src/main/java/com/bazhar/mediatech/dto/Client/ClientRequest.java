package com.bazhar.mediatech.dto.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.aspectj.bridge.IMessage;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequest {

    //@NotNull(message = "le champ est obligatoire")
    @NotBlank
    @Size(min = 5,message = "le  champs  doit  avoir  plus de  5 ")
    @Size(max = 15,message = "le  champs  doit  moin de  15")
    private String nom;
    @NotBlank
    @Size(min = 5,message = "le  champs  doit  avoir  plus de  5 ")
    @Size(max = 15,message = "le  champs  doit  moin de  15")
    private String prenom;
    @NotNull(message = "le  champ  est  obligatoir ")
    private String tel;
}
