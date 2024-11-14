package com.monteiro.HexagonalApiExample.infrastructure.controller.example;

import jakarta.validation.constraints.Min;

/**
 * Classe representando o Request para o endpoint de exemplo.
 * Define o formato da entrada esperada para o endpoint.
 */
public class ExampleRequest {

    @Min(value = 1, message = "O ID deve ser maior que 0")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
