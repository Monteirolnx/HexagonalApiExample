package com.monteiro.HexagonalApiExample.infrastructure.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.monteiro.HexagonalApiExample.application.example.ExampleService;
import com.monteiro.HexagonalApiExample.domain.example.ExampleDomain;
import com.monteiro.HexagonalApiExample.infrastructure.controller.example.ExampleController;
import com.monteiro.HexagonalApiExample.infrastructure.controller.example.ExampleRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ExampleController.class)
class ExampleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private ExampleService exampleService;

    @Test
    void getExample_ReturnsExampleResponse() throws Exception {
        // Cria um request e configura o mock
        ExampleRequest request = new ExampleRequest();
        request.setId(1);

        // Configura o exemplo de retorno para o mock
        ExampleDomain exampleDomain = new ExampleDomain();
        exampleDomain.setId(1);
        exampleDomain.setMessage("Ok - 1");

        // Configura o comportamento do mock
        when(exampleService.getExampleById(1)).thenReturn(exampleDomain);

        // Executa o teste
        mockMvc.perform(post("/api/example")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.message").value("Ok - 1"));
    }
}
