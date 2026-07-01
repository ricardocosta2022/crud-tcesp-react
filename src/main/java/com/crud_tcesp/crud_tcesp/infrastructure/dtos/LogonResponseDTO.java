package com.crud_tcesp.crud_tcesp.infrastructure.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LogonResponseDTO {

    private Boolean success;
    private String login;
    private String token;
    private String message;
}
