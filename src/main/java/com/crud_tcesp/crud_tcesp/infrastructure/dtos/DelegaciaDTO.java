package com.crud_tcesp.crud_tcesp.infrastructure.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(description = "DTO de Delegacia")
public class DelegaciaDTO {

    @Schema(description = "Código da delegacia", example = "1")
    private Integer codDelegacia;

    @Schema(description = "Descricao da delegacia", example = "Protocolo UR-18")
    private String descricao;

}
