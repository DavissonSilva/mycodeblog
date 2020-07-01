package com.spring.codeglog.service;

import java.util.List;
import java.util.List;
import com.spring.codeglog.model.Post;

public interface CodeBlogService {

	List<Post> findAll();
	Post finndById(long id );
	Post save(Post post);
	
}
