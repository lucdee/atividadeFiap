package com.fiap.servicocliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fiap.servicocliente.model.Atividade;


public interface AtividadeRepository extends MongoRepository<Atividade, String> {

}
