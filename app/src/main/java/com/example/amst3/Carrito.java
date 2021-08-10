package com.example.amst3;

import java.util.ArrayList;

public class Carrito {
    public static ArrayList<Libro> librosCarrito;
    static {
        librosCarrito = new ArrayList<>();
    }

    public static boolean addLibro(Libro libro){
        if (librosCarrito.contains(libro)) return false;
        librosCarrito.add(libro);
        return true;
    }

    public static void addLibros(ArrayList<Libro> libros){
        librosCarrito.addAll(libros);
    }

    public static void removeLibro(Libro libro){
        librosCarrito.remove(libro);
    }

    public static float getCosto() {
        float costo = 0;
        for (Libro l : librosCarrito){
            costo += l.getPrecio();
        }
        System.out.println(costo);
        return costo;
    }
}
