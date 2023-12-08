package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public  String helloWorld() {
		return  "Hello World";
	}
	
	@GetMapping("/bsm")
	public  String bsm() {
		 
		return "Mentalidade de crescimento</br>"
				+"Mentalidade de orientação ao futuro</br>"
				+"Mentalidade de persistência</br>"
				+"Responsabilidade pessoal</br>"
				+"Proatividade</br>"
				+"Orientação aos detalhes</br>"
				+"Comunicação</br>"
				+"Trabalho em equipe</br>";
				
	}
	
	@GetMapping("/obj")
	public  String objetivo() {
		return "Adiquirir e consquistar mais conhecimentos teóricos e práticos sobre Java e Spring Boot";
	}
}
