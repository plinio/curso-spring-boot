package com.projetos.cursos.mensagemWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class MensagemWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MensagemWebApplication.class, args);
		
	}
	
	@GetMapping("/")
	public String init() {
		return("<a href=\"create\"> Create</a><br/>"
				+ "<a href=\"read\"> Read</a><br/>"
				+ "<a href=\"update\"> Update</a><br/>"
				+ "<a href=\"delete\"> Delete</a><br/>"
				);
	}
	
	@GetMapping("/create")
	public String create() {
		return ("Registro criado");
	}
	
	@GetMapping("/read")
	public String read() {
		return ("Registro lido");
	}
	
	@GetMapping("/update")
	public String update() {
		return ("Registro atualizado");
	}
	
	@GetMapping("/delete")
	public String delete() {
		return ("Registro excluído");
	}

}
