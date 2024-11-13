package com.monteiro.HexagonalApiExample.infrastructure.controller;

import lombok.Data;

/**
 * Classe representando o Response para o endpoint de exemplo.
 * Define o formato da resposta retornada pelo endpoint.
 */
@Data
public class ExampleResponse {
    private int id;
    private String message;
}
