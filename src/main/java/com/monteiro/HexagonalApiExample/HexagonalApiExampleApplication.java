package com.monteiro.HexagonalApiExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal da aplicação.
 * *****************************************************************************************
 * Esta aplicação segue a arquitetura hexagonal, também conhecida como "Ports and Adapters",
 * que permite maior modularidade e independência de tecnologias externas.
 * As camadas são divididas em domínio (regras de negócio), aplicação (casos de uso),
 * e infraestrutura (adaptação para serviços externos).
 * *****************************************************************************************
 */
@SpringBootApplication
public class HexagonalApiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalApiExampleApplication.class, args);
	}

}
