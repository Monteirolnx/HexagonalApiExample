package com.monteiro.HexagonalApiExample.application;

import com.monteiro.HexagonalApiExample.domain.Example;

/**
 * Interface para o serviço de exemplo.
 * Define os casos de uso para a entidade de exemplo, como consulta e manipulação.
 */
public interface ExampleService {
    Example getExampleById(int id);
}
