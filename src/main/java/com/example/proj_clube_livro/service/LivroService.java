package com.example.proj_clube_livro.service;

import com.example.proj_clube_livro.dto.LivroDto;
import com.example.proj_clube_livro.enums.LivroStatus;
import com.example.proj_clube_livro.model.Livro;
import com.example.proj_clube_livro.repository.LivroRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public Page<LivroDto> findAll(Pageable pagination){
        return livroRepository.findAll(pagination).map(l -> new LivroDto(l));
    }

    public LivroDto findById(Long id) {
        return new LivroDto(livroRepository.getReferenceById(id));
    }

    @Transactional
    public LivroDto save(LivroDto livroDto) {
        Livro livro = Livro.fromDto(livroDto);
        return new LivroDto(livroRepository.save(livro));
    }

    @Transactional
    public LivroDto update(Long id, LivroDto livroDto) {
        Livro livro = Livro.fromDto(livroDto);
        livro.setId(id);
        return new LivroDto(livroRepository.save(livro));
    }

    @Transactional
    public void delete(Long id) {
        livroRepository.deleteById(id);
    }

    @Transactional
    public LivroDto updateStatus(Long id, String status) {
        Livro livro = livroRepository.getReferenceById(id);
        livro.setLivroStatus(LivroStatus.valueOf(status));
        livroRepository.save(livro);  // Necessário para persistir a alteração
        return new LivroDto(livro);
    }


}
