package com.nazrin.comp_store.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CPUDTO {

    private Integer id;
    
    @NotNull(message = "Name is required")
    @NotEmpty(message = "Name is required")
    private String name;
}
