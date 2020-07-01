package com.spring.codeglog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.codeglog.model.Post;

public interface BlogRepository extends JpaRepository<Post, Long > {

}
