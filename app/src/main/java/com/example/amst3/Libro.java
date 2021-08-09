package com.example.amst3;

import java.io.Serializable;

public class Libro implements Serializable {
    private String nombre;
    private String autor;
    private String editorial;
    private String descripcion;
    private int foto;
    private String categoria;

    public Libro(String nombre, String autor, String editorial, String descripcion, int foto, String categoria) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.descripcion = descripcion;
        this.foto = foto;
        this.categoria = this.categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public String getCategoria() {
        return categoria;
    }

}
