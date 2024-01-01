package com.fran.practica.spring.ejemploinyeccion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fran.practica.spring.ejemploinyeccion.models.Autor;
import com.fran.practica.spring.ejemploinyeccion.models.Libro;

@RestController
@RequestMapping("/libros")
public class LibrosControlador {

    @Autowired
    private Libro libro;

    @Autowired
    private Autor autor;

    @GetMapping("/1")
    public Libro mostrar(){

        libro.setAutor(libro.getAutor());
        libro.setGenero(libro.getGenero());
        libro.setPrecio(libro.getPrecio());
        libro.setTitulo(libro.getTitulo()); 

        return libro;
    }

    @GetMapping("/2")
    public Autor mostrarAutor(){

        autor.setNombre(autor.getNombre());
        autor.setApellidos(autor.getApellidos());
        autor.setEdad(autor.getEdad());

        return autor;
    }

}
