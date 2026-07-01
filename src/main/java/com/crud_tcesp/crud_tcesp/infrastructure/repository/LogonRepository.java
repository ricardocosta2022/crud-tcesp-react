package com.crud_tcesp.crud_tcesp.infrastructure.repository;

import com.crud_tcesp.crud_tcesp.infrastructure.entitys.Logon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LogonRepository extends JpaRepository<Logon, String> {

    Optional<Logon> findByLogin(String login);

}
