package com.example.proj_clube_livro.dto;

import com.example.proj_clube_livro.enums.LivroStatus;
import com.example.proj_clube_livro.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;


public record LivroDto(
        Long id,
        String titulo,
        String descricao,
        Float nota,
        Integer qtdePaginas,
        LivroStatus livroStatus) {

    public LivroDto(Livro livro) {
        this(livro.getId(), livro.getTitulo(), livro.getDescricao(),
                livro.getNota(), livro.getQtedPaginas(), livro.getLivroStatus());
    }



}
