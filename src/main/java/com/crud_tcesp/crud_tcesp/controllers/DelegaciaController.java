package com.crud_tcesp.crud_tcesp.controllers;

import com.crud_tcesp.crud_tcesp.business.DelegaciaService;
import com.crud_tcesp.crud_tcesp.documentacao.DelegaciaControllerDoc;
import com.crud_tcesp.crud_tcesp.infrastructure.dtos.DelegaciaDTO;
import com.crud_tcesp.crud_tcesp.infrastructure.entitys.Delegacia;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@Validated
@RestController
@RequestMapping("/api/delegacia")
public class DelegaciaController implements DelegaciaControllerDoc {

    private final DelegaciaService service;

    public DelegaciaController(DelegaciaService service) {
        this.service = service;
    }

    @GetMapping("/listarCodEDescricao")
    public ResponseEntity<List<DelegaciaDTO>> listarCodEDescricao(){
        return ResponseEntity.ok(service.listarCodEDescricao());
    }
/*
    @Operation(summary = "Lista todas as delegacia registradas.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista retornada com sucesso."),
            @ApiResponse(responseCode = "404", description = "Nenhuma delegacia encontrada.")
    })
    */
    @GetMapping("/listarTodos")
    public ResponseEntity<List<Delegacia>> listarTodos(){
        return ResponseEntity.ok(service.listarTodos());
    }




/*
    @Operation(summary = "Buscar delegacias por descricao.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista retornada com sucesso."),
            @ApiResponse(responseCode = "404", description = "Nenhuma delegacia encontrada.")
    })

 */
    @GetMapping("/descricao")
    public ResponseEntity<List<DelegaciaDTO>> listarDescricao( @RequestParam @NotBlank String descricao ){

        return ResponseEntity.ok(service.listarDescricao(descricao));

    }



}
