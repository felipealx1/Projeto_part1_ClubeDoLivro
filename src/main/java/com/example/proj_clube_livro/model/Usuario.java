package com.example.proj_clube_livro.model;

import com.example.proj_clube_livro.dto.UsuarioDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String endereco;

    // Método para criar um Usuario a partir do DTO
    public static Usuario fromDto(UsuarioDto usuarioDto) {
        return new Usuario(usuarioDto.id(), usuarioDto.nome(), usuarioDto.email(),
                usuarioDto.senha(), usuarioDto.telefone(), usuarioDto.endereco());
    }
}