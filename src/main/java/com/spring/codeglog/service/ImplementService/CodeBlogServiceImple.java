package com.spring.codeglog.service.ImplementService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeglog.Repository.BlogRepository;
import com.spring.codeglog.model.Post;
import com.spring.codeglog.service.CodeBlogService;
@Service
public class CodeBlogServiceImple implements CodeBlogService{
	
	@Autowired
	BlogRepository blogRepository;
	@Override
	
	public List<Post> findAll() {
		// Metado vai retonar uma lista de ports 
		return blogRepository.findAll();
	}

	@Override
	public Post finndById(long id) {
		// Metado vai retonar somente um post 
		return blogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		// Metado para salvar post
		return blogRepository.save(post);
	}
	

}
