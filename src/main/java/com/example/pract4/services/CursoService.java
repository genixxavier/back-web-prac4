package com.example.pract4.services;

import com.example.pract4.model.documents.Curso;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CursoService {
    public Flux<Curso> list();

    public Mono<Void> save(Curso curso);

    public Mono<Curso> search(String id);

    public Mono<Void> delete(String id);
}
