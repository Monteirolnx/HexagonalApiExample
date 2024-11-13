package com.monteiro.HexagonalApiExample.application;

import com.monteiro.HexagonalApiExample.domain.Example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleServiceTest {

    private final ExampleService exampleService = new ExampleServiceImpl();

    @Test
    void getExampleById_ReturnsExampleWithCorrectIdAndMessage() {
        int testId = 1;
        Example result = exampleService.getExampleById(testId);

        assertEquals(testId, result.getId());
        assertEquals("Ok - " + testId, result.getMessage());
    }
}
