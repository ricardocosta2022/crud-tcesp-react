package com.crud_tcesp.crud_tcesp.infrastructure.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioDTO {

    private Integer id;
    private String password;
}
