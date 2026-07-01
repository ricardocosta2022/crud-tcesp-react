package com.crud_tcesp.crud_tcesp.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name="delegacia")

public class Delegacia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codDelegacia")
    private Integer codDelegacia;
    private String descricao;
    private Integer status;
    private String telefone;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String e_mail;
    private String cep;

    private String codTipoLogradouro;

    private Integer codNucleo;

    private String codRegional;

}
