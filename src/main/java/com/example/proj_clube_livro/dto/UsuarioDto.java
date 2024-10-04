package com.example.proj_clube_livro.dto;

import com.example.proj_clube_livro.model.Usuario;

public record UsuarioDto(
        Long id,
        String nome,
        String email,
        String senha,
        String telefone,
        String endereco) {

    public UsuarioDto(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getSenha(),
                usuario.getTelefone(), usuario.getEndereco());
    }
}