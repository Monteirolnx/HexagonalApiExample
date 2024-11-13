package com.monteiro.HexagonalApiExample.infrastructure.controller;

import jakarta.validation.constraints.Min;
import lombok.Data;

/**
 * Classe representando o Request para o endpoint de exemplo.
 * Define o formato da entrada esperada para o endpoint.
 */
@Data
public class ExampleRequest {

    @Min(value = 1, message = "O ID deve ser maior que 0")
    private int id;
}
