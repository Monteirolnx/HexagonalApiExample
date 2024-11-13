package com.monteiro.HexagonalApiExample.infrastructure.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuração para o Swagger/OpenAPI.
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Hexagonal API Example")
                        .version("1.0")
                        .description("API seguindo a arquitetura hexagonal com documentação do Swagger"));
    }
}
