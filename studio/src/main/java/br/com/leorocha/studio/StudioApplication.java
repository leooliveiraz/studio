package br.com.leorocha.studio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class StudioApplication {

	public static void main(String[] args) {
		System.out.println("Iniciando Aplicação 8>");
		SpringApplication.run(StudioApplication.class, args);
		System.out.println("Aplicação em execução <3");
	}
}
