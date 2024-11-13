package com.monteiro.HexagonalApiExample.infrastructure.controller;

import com.monteiro.HexagonalApiExample.application.ExampleService;
import com.monteiro.HexagonalApiExample.domain.Example;
import com.monteiro.HexagonalApiExample.infrastructure.exception.ResourceNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para o endpoint de exemplo.
 * Este controlador age como a interface de entrada na arquitetura hexagonal.
 */
@RestController
@RequestMapping("/api/example")
public class ExampleController {

    private final ExampleService exampleService;

    @Autowired
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    /**
     * Endpoint para obter uma entidade Example com base no ID.
     *
     * @param request Requisição contendo o ID do Example
     * @return Response com o ID e uma mensagem de confirmação
     */
    @PostMapping
    public ExampleResponse getExample(@Valid @RequestBody ExampleRequest request) {
        Example example = exampleService.getExampleById(request.getId());

        ExampleResponse response = new ExampleResponse();
        response.setId(example.getId());
        response.setMessage(example.getMessage());

        return response;
    }

    @GetMapping("/test-exception/{id}")
    public Example testException(@PathVariable int id) {
        // Este método irá lançar ResourceNotFoundException se o ID for inválido
        if (id == 99) {
            throw new ResourceNotFoundException("Recurso com ID " + id + " não encontrado");
        }
        return exampleService.getExampleById(id);
    }
}
