package com.blogdomiguelinjava.repository;

import com.blogdomiguelinjava.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}
