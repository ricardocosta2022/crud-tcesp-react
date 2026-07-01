package com.crud_tcesp.crud_tcesp.documentacao;

import com.crud_tcesp.crud_tcesp.infrastructure.dtos.DelegaciaDTO;
import com.crud_tcesp.crud_tcesp.infrastructure.entitys.Delegacia;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;


@Tag(
        name= "Delegacia",
        description = "EndPoints relacionados a Delegacias")
public interface DelegaciaControllerDoc {


    @Operation(
            summary = "Lista todas as delegacias registradas.",
            description = "Lista delegacias",
            responses = {
                    @ApiResponse(responseCode = "200", description = "lista retornada com sucesso."),
                    @ApiResponse(responseCode = "404", description = "Nenhuma delegacia encontrada.")
            }
    )
    ResponseEntity<List<Delegacia>> listarTodos(
    );


    @Operation(
            summary = "Lista por descricao",
            description = "Lista delegacias",
            responses = {
                    @ApiResponse(responseCode = "200", description = "lista retornada com sucesso."),
                    @ApiResponse(responseCode = "404", description = "Nenhuma delegacia encontrada.")
            }
    )
    ResponseEntity<List<DelegaciaDTO>> listarDescricao(
            @Parameter(description = "Filtra por descricao informada")
            String descricao
    );


    @Operation(
            summary = "Pesquisa a delegacia por codigo ou por descricao",
            description = "Pesquisa a delegacia por codigo ou descricao",
            responses = {
                    @ApiResponse(responseCode = "200", description = "lista retornada com sucesso."),
                    @ApiResponse(responseCode = "404", description = "Nenhuma delegacia encontrada.")
            }
    )
    ResponseEntity<List<DelegaciaDTO>> listarCodEDescricao(

    );


}