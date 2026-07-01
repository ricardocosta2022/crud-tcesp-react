package com.crud_tcesp.crud_tcesp.controllers;

import com.crud_tcesp.crud_tcesp.business.UsuarioPoliciaDelegaciaService;
import com.crud_tcesp.crud_tcesp.infrastructure.dtos.UsuarioPoliciaDelegaciaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/delegacia")
@RequiredArgsConstructor
public class UsuarioPoliciaDelegaciaController {

    private final UsuarioPoliciaDelegaciaService service;

    // Endpoint para carregar os dados iniciais da grid
    @GetMapping("/carregamentoGridInicial")
    public ResponseEntity<List<UsuarioPoliciaDelegaciaDTO>> listarTodos(
                                                  @RequestParam(required = false) Integer codDelegacia,
                                                  @RequestParam(required = false) String loginNome ) {
        List<UsuarioPoliciaDelegaciaDTO> resultado = service.listaCarregamentoGridInicial(codDelegacia, loginNome);
        return ResponseEntity.ok(resultado);
    }

    /**
     * # Só por nome/login
     * GET http://localhost:8080/api/delegacia/servidores?loginNome=rmendes
     *
     * # Só por código
     * GET http://localhost:8080/api/delegacia/servidores?codDelegacia=1
     *
     * # Sem filtro (retorna tudo)
     * GET http://localhost:8080/api/delegacia/servidores
     *
     *  Os dois filtros juntos (retorna o que tiver loginNome e codDelegacia)
     * GET http://localhost:8080/api/delegacia/servidores?loginNome=rmendes&codDelegacia=1
     * */
    @GetMapping("/servidores")
    public ResponseEntity<List<UsuarioPoliciaDelegaciaDTO>> listarPorCodigoUnidadeOuLoginOuNome(
            @RequestParam(required = false) Integer codDelegacia,
            @RequestParam(required = false) String loginNome ) {
        List<UsuarioPoliciaDelegaciaDTO> resultado = service.listarPorCodigoUnidadeOuLoginOuNome(codDelegacia, loginNome);
        return ResponseEntity.ok(resultado);
    }


}
