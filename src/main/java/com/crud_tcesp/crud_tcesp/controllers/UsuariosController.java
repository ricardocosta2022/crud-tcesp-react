package com.crud_tcesp.crud_tcesp.controllers;

import com.crud_tcesp.crud_tcesp.business.UsuariosService;
import com.crud_tcesp.crud_tcesp.infrastructure.entitys.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// ou "*", se estiver testando 5174 ONDE RODA MEU FRONTEND COM REACTJS
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping(value = "api/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService service;

    @PostMapping
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuarios){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(usuarios));
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(service.listarTodos());
    }


    @GetMapping("/usuarioPorNomeSenha")
    public ResponseEntity<List<Usuario>> listarPorNomeESenha(@RequestParam(required = false) String nome,
                                                             @RequestParam(required = false) String password) {

        List<Usuario> resultado = service.listarPorNomeESenha(nome, password);
        return ResponseEntity.ok(resultado);
    }

}
