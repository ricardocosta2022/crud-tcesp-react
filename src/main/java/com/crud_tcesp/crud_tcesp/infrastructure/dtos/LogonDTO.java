package com.crud_tcesp.crud_tcesp.infrastructure.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LogonDTO {

    private String login;
    private String senha;
    private String nome;
    private Integer grupo;
    private String mensagem;

}
