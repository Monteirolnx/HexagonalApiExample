package com.monteiro.HexagonalApiExample.domain.example;

/**
 * Classe de domínio representando uma entidade de exemplo.
 * Aqui é onde são mantidas as regras de negócio relacionadas a essa entidade.
 */
public class ExampleDomain {
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
