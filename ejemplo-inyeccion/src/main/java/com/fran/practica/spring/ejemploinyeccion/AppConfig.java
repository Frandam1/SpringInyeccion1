package com.fran.practica.spring.ejemploinyeccion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.fran.practica.spring.ejemploinyeccion.models.Autor;
import com.fran.practica.spring.ejemploinyeccion.models.Libro;

@Configuration
@PropertySource(value = "classpath:infolibros.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean
    public Libro libro(){

        return new Libro();
    }

    @Bean
    public Autor autor(){
        
        return new Autor();
    }
}
