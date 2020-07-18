package com.spring.codeglog.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.spring.codeglog.Repository.CadastroRepository;
import com.spring.codeglog.model.Cadastro;

@Repository
public class ImplementsCadasDetailsService implements UserDetailsService{
	@Autowired
	private  CadastroRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Cadastro cadastro = ur.findByLogin(login);
		if(cadastro == null) {
			throw new UsernameNotFoundException("Usuario não encontrado!");
		}
		return cadastro;
	}
	

}
