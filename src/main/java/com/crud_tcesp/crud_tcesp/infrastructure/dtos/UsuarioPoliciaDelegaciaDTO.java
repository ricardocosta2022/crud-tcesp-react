package com.crud_tcesp.crud_tcesp.infrastructure.dtos;

import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;

public interface UsuarioPoliciaDelegaciaDTO {
    Integer getIdUsuarioPoliciaDelegacia();
    Integer getCodDelegacia();
    Timestamp  getDataInicio();
    Timestamp getDataFim();
    String getNome();
    String getLogin();
    Integer getSituacao();
    String getDescricao();
}

/*
@NoArgsConstructor
@Getter
@Setter
public class UsuarioPoliciaDelegaciaDTO {

    private Integer idUsuarioPoliciaDelegacia;
    private Integer codDelegacia;
    private Date dataInicio;
    private Date dataFim;
    private String nome;
    private String login;
    private Integer situacao;
    private String descricao;

    public UsuarioPoliciaDelegaciaDTO(Integer idUsuarioPoliciaDelegacia,
                                      Integer codDelegacia,
                                      Date dataInicio,
                                      Date dataFim,
                                      String nome,
                                      String login,
                                      Integer situacao,
                                      String descricao) {
        this.idUsuarioPoliciaDelegacia = idUsuarioPoliciaDelegacia;
        this.codDelegacia = codDelegacia;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.nome = nome;
        this.login = login;
        this.situacao = situacao;
        this.descricao = descricao;
    }
}
*/

