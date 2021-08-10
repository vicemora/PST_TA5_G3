package com.example.amst3;

import java.io.Serializable;
import java.util.ArrayList;

public class Libro implements Serializable {
    public static final ArrayList<Libro> listLibrosDatos = new ArrayList<>();
    static {
        listLibrosDatos.add(new Libro("libro1", "yo pues", "prueba", "descrip", R.drawable.bart, "categoria1", 10.11));
        listLibrosDatos.add(new Libro("libro2", "yo pues", "prueba", "descrip", R.drawable.burns, "categoria2", 10.11));
        listLibrosDatos.add(new Libro("libro3", "yo pues", "prueba", "descrip", R.drawable.flanders, "categoria3", 10.11));
        listLibrosDatos.add(new Libro("libro1", "yo pues", "prueba", "descrip", R.drawable.bart, "categoria4", 10.11));
        listLibrosDatos.add(new Libro("libro2", "yo pues", "prueba", "descrip", R.drawable.burns, "categoria1", 10.11));
        listLibrosDatos.add(new Libro("libro3", "yo pues", "prueba", "descrip", R.drawable.flanders, "categoria3", 10.11));
        listLibrosDatos.add(new Libro("libro1", "yo pues", "prueba", "descrip", R.drawable.bart, "categoria1", 10.11));
        listLibrosDatos.add(new Libro("libro2", "yo pues", "prueba", "descrip", R.drawable.burns, "categoria1", 10.11));
        listLibrosDatos.add(new Libro("libro3", "yo pues", "prueba", "descrip", R.drawable.flanders, "categoria2", 10.11));
        listLibrosDatos.add(new Libro("libro1", "yo pues", "prueba", "descrip", R.drawable.bart, "categoria3", 10.11));
        listLibrosDatos.add(new Libro("libro2", "yo pues", "prueba", "descrip", R.drawable.burns, "categoria4", 10.11));
        listLibrosDatos.add(new Libro("libro3", "yo pues", "prueba", "descrip", R.drawable.flanders, "categoria1", 10.11));
        listLibrosDatos.add(new Libro("libro1", "yo pues", "prueba", "descrip", R.drawable.bart, "categoria2", 10.11));
        listLibrosDatos.add(new Libro("libro2", "yo pues", "prueba", "descrip", R.drawable.burns, "categoria3", 10.11));
        listLibrosDatos.add(new Libro("libro3", "yo pues", "prueba", "descrip", R.drawable.flanders, "categoria4", 10.11));

    }

    private String nombre;
    private String autor;
    private String editorial;
    private String descripcion;
    private int foto;
    private String categoria;
    private double precio;

    public Libro(String nombre, String autor, String editorial, String descripcion, int foto, String categoria, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.descripcion = descripcion;
        this.foto = foto;
        this.categoria = categoria;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

}
