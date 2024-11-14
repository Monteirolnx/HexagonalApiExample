package com.monteiro.HexagonalApiExample.application.example;

import com.monteiro.HexagonalApiExample.domain.example.ExampleDomain;
import org.springframework.stereotype.Service;

/**
 * Implementação do serviço de exemplo.
 * Aqui é onde a lógica do caso de uso é implementada, simulando a consulta a um serviço ou repositório.
 */
@Service
public class ExampleServiceImpl implements ExampleService {

    @Override
    public ExampleDomain getExampleById(int id) {
        // Simulação de um retorno com base no ID fornecido
        ExampleDomain exampleDomain = new ExampleDomain();
        exampleDomain.setId(id);
        exampleDomain.setMessage("Ok - " + id);
        return exampleDomain;
    }
}
