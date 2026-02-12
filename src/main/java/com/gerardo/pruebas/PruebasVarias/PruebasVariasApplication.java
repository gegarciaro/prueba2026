package com.gerardo.pruebas.PruebasVarias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebasVariasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebasVariasApplication.class, args);

        System.out.println("tengo esta version para QA donde salen letreros");
	}

	public void metodoDev() {
		// Esta pusieron en desarrollo
	}
}
