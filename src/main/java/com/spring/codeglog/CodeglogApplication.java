package com.spring.codeglog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeglogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeglogApplication.class, args);
		
		
	}
	
	
	public String razao( int a, int b){
		
	int razao = 0;	
	String msg = "Impossivel dividir por '0'";
		
    if(a != 0) {
    	razao = a/ b ;  
    	
    	return "a razão entre os numeros é: " + razao;
    	
    }else {
    	return msg;
    }
		
		
	}
	
	
	
}

