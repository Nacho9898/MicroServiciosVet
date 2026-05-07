package cl.duoc.veterinaria.cita_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients; // <--- 1. Importa esto

@SpringBootApplication
@EnableFeignClients // <--- 2. Agrega esto para activar Feign
public class CitaMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitaMsApplication.class, args);
	}

}