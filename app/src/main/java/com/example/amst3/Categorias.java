package com.example.amst3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Categorias extends AppCompatActivity {
    ArrayList<Libro> listLibrosCat1;
    ArrayList<Libro> listLibrosCat2;
    ArrayList<Libro> listLibrosCat3;
    ArrayList<Libro> listLibrosCat4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
        Bundle bundle= getIntent().getExtras();
        ArrayList<Libro> libros= (ArrayList<Libro>) bundle.getSerializable("libros");
        listLibrosCat1= new ArrayList<>();
        listLibrosCat2= new ArrayList<>();
        listLibrosCat3= new ArrayList<>();
        listLibrosCat4= new ArrayList<>();
        llenarLibros(libros);
    }
    private void llenarLibros(ArrayList<Libro> libros) {
        for (Libro l:libros){
            if (l.getCategoria().equals("categoria1")){
                listLibrosCat1.add(new Libro(l.getNombre(), l.getAutor(), l.getEditorial(), l.getDescripcion(), l.getFoto(), l.getCategoria()));
            }
            if (l.getCategoria().equals("categoria2")){
                listLibrosCat2.add(new Libro(l.getNombre(), l.getAutor(), l.getEditorial(), l.getDescripcion(), l.getFoto(), l.getCategoria()));
            }
            if (l.getCategoria().equals("categoria3")){
                listLibrosCat3.add(new Libro(l.getNombre(), l.getAutor(), l.getEditorial(), l.getDescripcion(), l.getFoto(), l.getCategoria()));
            }
            if (l.getCategoria().equals("categoria4")){
                listLibrosCat3.add(new Libro(l.getNombre(), l.getAutor(), l.getEditorial(), l.getDescripcion(), l.getFoto(), l.getCategoria()));
            }
        }
    }
    public void btnCategoria1(View view) {
        Intent categoria1 = new Intent(this, ResCategoria.class ); //se crea para ir a otro activity
        Bundle bundle=new Bundle();
        bundle.putSerializable("librosCat",listLibrosCat1);
        categoria1.putExtras(bundle);
        startActivity(categoria1); //se abre el activity
    }
    public void btnCategoria2(View view) {
        Intent categoria2 = new Intent(this, ResCategoria.class ); //se crea para ir a otro activity
        Bundle bundle=new Bundle();
        bundle.putSerializable("librosCat",listLibrosCat2);
        categoria2.putExtras(bundle);
        startActivity(categoria2); //se abre el activity
    }
    public void btnCategoria3(View view) {
        Intent categoria3 = new Intent(this, ResCategoria.class ); //se crea para ir a otro activity
        Bundle bundle=new Bundle();
        bundle.putSerializable("librosCat",listLibrosCat3);
        categoria3.putExtras(bundle);
        startActivity(categoria3); //se abre el activity
    }
    public void btnCategoria4(View view) {
        Intent categoria4 = new Intent(this, ResCategoria.class ); //se crea para ir a otro activity
        Bundle bundle=new Bundle();
        bundle.putSerializable("librosCat",listLibrosCat4);
        categoria4.putExtras(bundle);
        startActivity(categoria4); //se abre el activity
    }

}