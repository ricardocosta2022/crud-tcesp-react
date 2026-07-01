package com.crud_tcesp.crud_tcesp.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "usuario_policia_delegacia")
public class UsuarioPoliciaDelegacia {

    @Id
    private Integer idUsuarioPoliciaDelegacia;
    private Integer codDelegacia;
    @Column(name = "datainicio")
    private Timestamp dataInicio;
    @Column(name = "datafim")
    private Timestamp  dataFim;
    private String login;
}
