package com.monteiro.HexagonalApiExample.infrastructure.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Exemplo de um HealthCheck personalizado.
 * Aqui, você pode adicionar uma verificação de saúde para um serviço externo.
 */
@Component
public class CustomServiceHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        // Simule uma condição de verificação, por exemplo, chamando um serviço externo
        boolean serviceIsUp = checkExternalService();

        if (serviceIsUp) {
            return Health.up().withDetail("CustomService", "Available").build();
        } else {
            return Health.down().withDetail("CustomService", "Unavailable").build();
        }
    }

    private boolean checkExternalService() {
        // Lógica para verificar o serviço (pode ser uma chamada HTTP, por exemplo)
        return true; // Simulando que o serviço está "UP"
    }
}
