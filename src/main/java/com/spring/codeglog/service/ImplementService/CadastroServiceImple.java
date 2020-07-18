package com.spring.codeglog.service.ImplementService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.codeglog.Repository.CadastroRepository;
import com.spring.codeglog.model.Cadastro;
import com.spring.codeglog.model.Post;
import com.spring.codeglog.service.CadastroService;

@Service
public class CadastroServiceImple implements CadastroService{

	@Autowired
	CadastroRepository cadastrorepository;
	



	@Override
	public List<Cadastro> findAll() {
		// Metado vai retonar uma lista de Cadastro 
		return null;
	}



	@Override
	public Cadastro finndById(long id) {
		// Metado vai retonar somente cadastro 
		return null;
	}



	@Override
	public Cadastro save(Cadastro cadastro) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode("123");
		return cadastro ;
	}
	
}
