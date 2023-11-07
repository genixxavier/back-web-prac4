package com.example.pract4.model.repositories;

import com.example.pract4.model.documents.Curso;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CursoRepository extends ReactiveMongoRepository<Curso, String> {
}
