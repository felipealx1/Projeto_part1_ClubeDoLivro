package com.example.proj_clube_livro.service;

import com.example.proj_clube_livro.dto.UsuarioDto;
import com.example.proj_clube_livro.model.Usuario;
import com.example.proj_clube_livro.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    @Transactional
    public UsuarioDto registrar(UsuarioDto usuarioDto) {
        Usuario usuario = Usuario.fromDto(usuarioDto);
        return new UsuarioDto(usuarioRepository.save(usuario));
    }


    public UsuarioDto buscarPorId(Long id) {
        return new UsuarioDto(usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado")));
    }


    @Transactional
    public UsuarioDto atualizar(Long id, UsuarioDto usuarioDto) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        usuario.setNome(usuarioDto.nome());
        usuario.setEmail(usuarioDto.email());
        usuario.setSenha(usuarioDto.senha());
        usuario.setTelefone(usuarioDto.telefone());
        usuario.setEndereco(usuarioDto.endereco());

        return new UsuarioDto(usuarioRepository.save(usuario));
    }
}
