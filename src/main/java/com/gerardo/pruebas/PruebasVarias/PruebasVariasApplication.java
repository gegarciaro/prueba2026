package com.gerardo.pruebas.PruebasVarias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebasVariasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebasVariasApplication.class, args);

        System.out.println("tengo esta version para QA donde salen letreros");

		System.out.println("Esta es mi versíón de compras que tengo que subir a desarrollo");
		System.out.println("Despues a QA");
		metodoDev();
	}

	public static void metodoDev() {
		// Esta pusieron en desarrollo

		System.out.println("\n");
		System.out.println("Mejoras desde hotfix porque tengo que probarlas en el servr");

		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.printf("cambios en hotfix");

	}
}
