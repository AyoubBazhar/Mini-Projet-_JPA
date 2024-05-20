package com.bazhar.mediatech.dto;

import lombok.Data;

import java.util.List;
@Data
public class FactureDto {
    private String ref;
    private String cin;
    List<FactureLigneDto> factureLigneDtoList;
}
