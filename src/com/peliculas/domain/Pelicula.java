package com.peliculas.domain;

public class Pelicula {
    //javabean, el atrubuto es privado y debe habe un constructor vacio, e inplementar la interfaz serializable
    private String nombre;

    public Pelicula() {
    }

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
