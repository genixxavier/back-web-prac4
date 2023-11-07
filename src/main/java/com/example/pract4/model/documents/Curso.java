package com.example.pract4.model.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cursos")
public class Curso {
    @Id
    private String id;

    private String nombre;

    private String descripcion;

    private String aula;

    public Curso() {
    }

    public Curso(String id, String nombre, String descripcion, String aula) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.aula = aula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", aula='" + aula + '\'' +
                '}';
    }
}
