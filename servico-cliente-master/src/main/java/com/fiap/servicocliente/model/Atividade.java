package com.fiap.servicocliente.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection = "atividade")
public class Atividade {

	@Id
	private int rm;
	
	private String nome;
	
	private String url;
	
	private int numAtividade;
}
