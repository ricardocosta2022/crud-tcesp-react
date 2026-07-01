package com.crud_tcesp.crud_tcesp.infrastructure.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Logon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Logon {

    @Id
    private String login;
    private String senha;
    private String nome;
    private Integer grupo;
    private Integer senhaLiberada;
    private Integer situacao;
    private String loginexterno;
    private Date dataAceiteTermo;
    private Date datainclusao;
    private String codinome;
    private String agregador;
    private String dirUsuario;
    private String codExterno;
    private String codi_nome;
    private String logon;
}
