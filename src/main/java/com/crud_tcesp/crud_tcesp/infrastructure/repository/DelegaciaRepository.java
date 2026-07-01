package com.crud_tcesp.crud_tcesp.infrastructure.repository;

import com.crud_tcesp.crud_tcesp.infrastructure.dtos.DelegaciaDTO;
import com.crud_tcesp.crud_tcesp.infrastructure.entitys.Delegacia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DelegaciaRepository extends JpaRepository<Delegacia, Integer> {


    @Query("""
    SELECT new com.crud_tcesp.crud_tcesp.infrastructure.dtos.DelegaciaDTO(
        d.codDelegacia,
        d.descricao
    )
    FROM Delegacia d
    """)
    List<DelegaciaDTO> listarCodEDescricao();



    @Query("""
    SELECT new com.crud_tcesp.crud_tcesp.infrastructure.dtos.DelegaciaDTO(
        d.codDelegacia,
        d.descricao
    )
    FROM Delegacia d
    WHERE UPPER(d.descricao) LIKE UPPER(CONCAT('%', :descricao, '%'))
""")
    List<DelegaciaDTO> findByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}
