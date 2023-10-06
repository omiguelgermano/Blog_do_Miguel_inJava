package com.blogdomiguelinjava.repository;

import com.blogdomiguelinjava.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Método finder
    Optional<Usuario> findByEmail(String email);

    Optional<List<Usuario>> findByNome(String nome);
    // TODO: findByNomeLike e findByNomeAndEmail
}
