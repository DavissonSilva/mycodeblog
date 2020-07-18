package com.spring.codeglog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.codeglog.model.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, String> {
	
Cadastro findByLogin(String login);

}
