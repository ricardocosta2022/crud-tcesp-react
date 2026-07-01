package com.crud_tcesp.crud_tcesp.infrastructure.repository;

import com.crud_tcesp.crud_tcesp.infrastructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

    @Query("""
    SELECT u
    FROM Usuario u
    WHERE 
        (:nome IS NULL OR :nome = '' 
            OR LOWER(TRIM(u.nome)) LIKE LOWER(CONCAT('%', TRIM(:nome), '%')))
    AND
        (:password IS NULL OR :password = '' 
            OR u.password = :password)
""")
    List<Usuario> listarPorNomeESenha(
            @Param("nome") String nome,
            @Param("password") String password
    );

}
