package com.example.pract4.services;

import com.example.pract4.model.documents.Curso;
import com.example.pract4.model.repositories.CursoRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    private final CursoRepository  cursoRepository;

    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public Flux<Curso> list() {
        return cursoRepository.findAll();
    }

    @Override
    public Mono<Void> save(Curso curso) {
        return  cursoRepository.save(curso).then();
    }

    @Override
    public Mono<Curso> search(String id) {
        return cursoRepository.findById(id);
    }

    @Override
    public Mono<Void> delete(String id) {
        return cursoRepository.deleteById(id).then();
    }
}
