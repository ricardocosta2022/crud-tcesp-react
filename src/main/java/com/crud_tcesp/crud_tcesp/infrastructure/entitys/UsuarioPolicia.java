package com.crud_tcesp.crud_tcesp.infrastructure.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "usuario_policia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioPolicia {

    private String rg_pessoa;
    @Column(name = "rgorgaoexpedidor")
    private String rgOrgaoExpedidor;
    private String rgUF;
    private Date data_nascimento;
    private String cpf_pessoa;
    private String telefone_pessoa;
    @Id
    private String login;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String e_mail;
    private String cep;
    private Integer matricula;
    @Column(name = "CODTIPOLOGRADOURO")
    private String codTipoLogradouro;
}
