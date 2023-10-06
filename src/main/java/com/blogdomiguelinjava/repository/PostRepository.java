package com.blogdomiguelinjava.repository;

import com.blogdomiguelinjava.model.Post;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {

//    @Query(value = "SELECT p FROM tb_posts p WHERE p.usuario.idUsuario = :id")
//    Optional<Page<Post>> findByUsuario(@Param("id") Long idUsuario, Pageable pageable);

//    Page<Post> findPostsByAutorId(Long idAutor, Pageable pageable);
}
