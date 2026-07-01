package com.crud_tcesp.crud_tcesp.controllers;

import com.crud_tcesp.crud_tcesp.business.LogonService;
import com.crud_tcesp.crud_tcesp.infrastructure.dtos.LogonDTO;
import com.crud_tcesp.crud_tcesp.infrastructure.dtos.LogonResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/logon")
@RequiredArgsConstructor
public class LogonController {

    private final LogonService logonService;

        @PostMapping("/login")
        public ResponseEntity<?> login(@RequestBody LogonDTO dto) {

            LogonDTO response = logonService.logar(
                    LogonDTO.builder()
                            .login(dto.getLogin())
                            .senha(dto.getSenha())
                            .build());

            LogonResponseDTO retorno = LogonResponseDTO.builder()
                    .success(true)
                    .login(response.getLogin())
                    .message("Login realizado com sucesso")
                    .build();

            return ResponseEntity.ok(retorno);
        }
}
