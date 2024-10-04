package com.example.proj_clube_livro.repository;

import com.example.proj_clube_livro.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
