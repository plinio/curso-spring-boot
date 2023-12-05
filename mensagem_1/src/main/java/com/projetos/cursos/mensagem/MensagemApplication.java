package com.projetos.cursos.mensagem;

import javax.swing.JOptionPane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class MensagemApplication {

	public static void main(String[] args) {
		//System.setProperty("java.awt.headless", "false");
		SpringApplication.run(MensagemApplication.class, args);
		System.out.println("Primeiro projeto Spring Boot");
		//JOptionPane.showMessageDialog(null, "Primeiro projeto Spring Boot");
		//create();
		//read();
	}

	//CRUD
	@PostConstruct
	public static  void create() {
		System.out.println("Registro criado");
	}
	@PostConstruct
	public static void read() {
		System.out.println("Registro lido");
	}
	@PostConstruct
	public static void update() {
		System.out.println("Registro atualizado");
	}
	@PostConstruct
	public static void delete() {
		System.out.println("Registro excluído");
	}
}
