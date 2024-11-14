package com.monteiro.HexagonalApiExample.application.example;

import com.monteiro.HexagonalApiExample.domain.example.ExampleDomain;

/**
 * Interface para o serviço de exemplo.
 * Define os casos de uso para a entidade de exemplo, como consulta e manipulação.
 */
public interface ExampleService {
    ExampleDomain getExampleById(int id);
}
