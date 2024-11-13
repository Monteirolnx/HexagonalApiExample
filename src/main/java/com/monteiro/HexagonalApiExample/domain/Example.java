package com.monteiro.HexagonalApiExample.domain;

import lombok.Data;

/**
 * Classe de domínio representando uma entidade de exemplo.
 * Aqui é onde são mantidas as regras de negócio relacionadas a essa entidade.
 */
@Data
public class Example {
    private int id;
    private String message;
}