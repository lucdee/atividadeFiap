package com.fiap.servicocliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.servicocliente.model.Cliente;

//Rest API 
@SpringBootApplication
@RestController
public class ServicoClienteApplication {
	
	@GetMapping("/")
	public String get() {
		//Integer i = 1 / 0;
		
		Cliente cliente  = new Cliente();
		
		cliente.setNome("Thiago Xavier");
		
		return "Bem vindo a rest API. "; //ponto de acesso ou endpoint 
	}

	public static void main(String[] args) {
		SpringApplication.run(ServicoClienteApplication.class, args);
	}

}
