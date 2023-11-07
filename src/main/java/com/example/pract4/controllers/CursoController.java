package com.example.pract4.controllers;

import com.example.pract4.model.documents.Curso;
import com.example.pract4.services.CursoService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public Flux<Curso> getAllCursos(){
        return cursoService.list();
    }

    @GetMapping("/{id}")
    public Mono<Curso> getCursoById(@PathVariable String id){
        return cursoService.search(id);
    }

    @PostMapping
    public Mono<Void> createCurso(@RequestBody Curso curso){
        return cursoService.save(curso);
    }

    @DeleteMapping("{id}")
    public  Mono<Void> deleteCurso(@PathVariable String id){
        return cursoService.delete(id);
    }
}
