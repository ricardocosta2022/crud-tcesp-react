package com.crud_tcesp.crud_tcesp.infrastructure.repository;
import com.crud_tcesp.crud_tcesp.infrastructure.dtos.UsuarioPoliciaDelegaciaDTO;
import com.crud_tcesp.crud_tcesp.infrastructure.entitys.UsuarioPoliciaDelegacia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioPoliciaDelegaciaRepository extends JpaRepository<UsuarioPoliciaDelegacia, Integer> {

    @Query("""
    SELECT
        upd.idUsuarioPoliciaDelegacia AS idUsuarioPoliciaDelegacia,
        upd.codDelegacia              AS codDelegacia,
        upd.dataInicio                AS dataInicio,
        upd.dataFim                   AS dataFim,
        l.nome                        AS nome,
        l.login                       AS login,
        l.situacao                    AS situacao,
        d.descricao                   AS descricao
    FROM UsuarioPolicia up
    JOIN Logon l ON up.login = l.login
    JOIN UsuarioPoliciaDelegacia upd ON upd.login = up.login
    JOIN Delegacia d ON d.codDelegacia = upd.codDelegacia
    WHERE (upd.dataFim >= CURRENT_DATE OR upd.dataFim IS NULL)
      AND (:codDelegacia IS NULL OR upd.codDelegacia = :codDelegacia)
      AND (:loginNome IS NULL OR l.login LIKE %:loginNome% OR l.nome LIKE %:loginNome%)
""")
    List<UsuarioPoliciaDelegaciaDTO> listaCarregamentoGridInicialOuListarPorNomeOuCodigoUnidadde(
            @Param("codDelegacia") Integer codDelegacia,
            @Param("loginNome") String loginNome
    );

}
