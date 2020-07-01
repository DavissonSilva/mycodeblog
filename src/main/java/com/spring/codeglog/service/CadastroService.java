package com.spring.codeglog.service;

import java.util.List;

import com.spring.codeglog.model.Cadastro;

public interface CadastroService {

	List<Cadastro> findAll();
	Cadastro finndById(long id );
	Cadastro save(Cadastro cadastro);
	
}
