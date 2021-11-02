package com.fiap.servicocliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.servicocliente.model.Cliente;
import com.fiap.servicocliente.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	//201 
	@PostMapping()
	public ResponseEntity<Cliente> post(@RequestBody Cliente model ) {
		
		Cliente cliente =  clienteRepository.save( model);
		
		return new ResponseEntity<>(cliente, HttpStatus.CREATED) ; 
	}
	
	@GetMapping()
	public List<Cliente> getAll(){
		return clienteRepository.findAll();
	}

}
