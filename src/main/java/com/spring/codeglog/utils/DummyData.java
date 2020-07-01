package com.spring.codeglog.utils;


import com.spring.codeglog.model.Cadastro;
import com.spring.codeglog.model.Post; 
import com.spring.codeglog.Repository.BlogRepository;
import com.spring.codeglog.Repository.CadastroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeglog.Repository.BlogRepository;
import com.spring.codeglog.model.Post;

@Component
public class DummyData {

	@Autowired
	CadastroRepository cadastroRepository;

   // @PostConstruct
    public void savePosts(){

    	List<Cadastro> cadastrotList = new ArrayList<>();
        Cadastro cadastro1 = new Cadastro();
        cadastro1.setNome("Bruno Alexandre");
        cadastro1.setEmail("BrunoAlexandre@gmail.com");
        cadastro1.setSenha("Bruno");
        cadastro1.setLogin("Bruno ");
        
        
      
        Cadastro cadastro2 = new Cadastro();
        cadastro2.setNome("Michelli Brito");
        cadastro2.setEmail("Michellibrito@gmail.com");
        cadastro2.setSenha("Michelli");
        cadastro2.setLogin("Michelli ");
        
       
        cadastrotList.add(cadastro1);
        cadastrotList.add(cadastro2);

      
        for(Cadastro cadastro: cadastrotList){
        	Cadastro cadastroSaved = cadastroRepository.save(cadastro);
   
            System.out.println(cadastroSaved.getId());
	
        }
    }
}
