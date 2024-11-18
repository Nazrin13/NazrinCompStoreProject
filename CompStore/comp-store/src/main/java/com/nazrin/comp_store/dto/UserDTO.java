package com.nazrin.comp_store.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Integer id;
    private String username;
    private String name;
    private String surname;
    private String email;
    private String password;
}
