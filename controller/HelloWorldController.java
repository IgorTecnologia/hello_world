package com.generation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping("hw")
	public  String helloWorld() {
		
		return  "Hello World";
	}
	
	@GetMapping("bsm")
	public static String Bsm() {
		 
		return "Mentalidade de crescimento"
				+"Mentalidade de orientação ao futuro"
				+"Mentalidade de persistência"
				+"Responsabilidade pessoal"
				+"Proatividade"
				+"Orientação aos detalhes"
				+"Comunicação"
				+"Trabalho em equipe";
				
	}
	
	@GetMapping("obj")
	public static String Objetivo() {
		return "Adiquirir e consquistar mais conhecimentos teóricos e práticos sobre Java e Spring Boot";
	}
}
