package com.example.proj_clube_livro.repository;

import com.example.proj_clube_livro.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
