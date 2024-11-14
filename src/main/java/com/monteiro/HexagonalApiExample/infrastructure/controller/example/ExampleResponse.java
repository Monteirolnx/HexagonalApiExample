package com.monteiro.HexagonalApiExample.infrastructure.controller.example;

/**
 * Classe representando o Response para o endpoint de exemplo.
 * Define o formato da resposta retornada pelo endpoint.
 */
public class ExampleResponse {
    private int id;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
