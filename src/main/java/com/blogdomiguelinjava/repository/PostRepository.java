package com.blogdomiguelinjava.repository;

import com.blogdomiguelinjava.model.Post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
