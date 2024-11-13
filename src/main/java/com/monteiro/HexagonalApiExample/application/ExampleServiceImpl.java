package com.monteiro.HexagonalApiExample.application;

import com.monteiro.HexagonalApiExample.domain.Example;
import org.springframework.stereotype.Service;

/**
 * Implementação do serviço de exemplo.
 * Aqui é onde a lógica do caso de uso é implementada, simulando a consulta a um serviço ou repositório.
 */
@Service
public class ExampleServiceImpl implements ExampleService {

    @Override
    public Example getExampleById(int id) {
        // Simulação de um retorno com base no ID fornecido
        Example example = new Example();
        example.setId(id);
        example.setMessage("Ok - " + id);
        return example;
    }
}
