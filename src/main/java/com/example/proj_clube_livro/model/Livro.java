package com.example.proj_clube_livro.model;

import com.example.proj_clube_livro.dto.LivroDto;
import com.example.proj_clube_livro.enums.LivroStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 80, nullable = false)
    private String titulo;
    private String descricao;
    private Float nota;
    private Integer qtedPaginas;
    @Enumerated(EnumType.STRING)
    private LivroStatus livroStatus;

    public static Livro fromDto(LivroDto livroDto) {
        return new Livro(livroDto.id(), livroDto.titulo(), livroDto.descricao(),
                livroDto.nota(), livroDto.qtdePaginas(), livroDto.livroStatus());
    }


}
