package com.bazhar.mediatech.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data

public class ProduitDto {
    @NotBlank
    String ref;
    @NotBlank
    String libelle;
@NotNull
    BigDecimal prix;
    @NotNull
    long quantity;

}
