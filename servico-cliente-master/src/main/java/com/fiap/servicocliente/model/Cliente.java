package com.fiap.servicocliente.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "clientes")
public class Cliente {

	@Id
	private String id; 
	
	private String nome;
	
	
	
}
