package br.com.dio.Ex7_ProjetoFeign2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //habilita o recurso de alimentar a API/executar em uma porta diferente
public class Ex7ProjetoFeign2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex7ProjetoFeign2Application.class, args);
	}

}
