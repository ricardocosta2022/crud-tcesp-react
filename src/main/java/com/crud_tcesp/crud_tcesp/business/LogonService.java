package com.crud_tcesp.crud_tcesp.business;


import com.crud_tcesp.crud_tcesp.infrastructure.dtos.LogonDTO;
import com.crud_tcesp.crud_tcesp.infrastructure.entitys.Logon;
import com.crud_tcesp.crud_tcesp.infrastructure.repository.LogonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogonService {

    @Autowired
    private final LogonRepository logonRepository;


    public LogonService(LogonRepository logonRepository) {
        this.logonRepository = logonRepository;
    }

    public LogonDTO logar(LogonDTO dto) {

        Logon logon = logonRepository.findByLogin(dto.getLogin())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        if (!logon.getSenha().equals(dto.getSenha())) {
            throw new RuntimeException("Senha incorreta");
        }

        if(logon.getSituacao() != null && logon.getSituacao() == 0){
            throw new RuntimeException("Usuário inativo");
        }

        return LogonDTO.builder()
                .login(logon.getLogin())
                .nome(logon.getNome())
                .grupo(logon.getGrupo())
                .mensagem("Login bem-sucedido")
                .build();

    }

}
