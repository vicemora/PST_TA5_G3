package com.example.amst3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Busqueda extends AppCompatActivity {
    ArrayList<Libro> listLibros;
    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);
        Bundle bundle= getIntent().getExtras();
        TextView textBusqueda= (TextView) findViewById(R.id.idBusqueda);
        ArrayList<Libro> libros= (ArrayList<Libro>) bundle.getSerializable("libros");
        textBusqueda.setText(bundle.getString("nombreBusqueda").toString());
        recycler= (RecyclerView) findViewById(R.id.idRecyclerBusqueda);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        listLibros= new ArrayList<>();
        llenarLibros(bundle.getString("nombreBusqueda").toString(), libros);
        com.example.amst3.AdapterDatos adapter= new com.example.amst3.AdapterDatos(listLibros);
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), com.example.amst3.Descripcion.class);
                i.putExtra("nombre",listLibros.get(recycler.getChildAdapterPosition(v)).getNombre());
                i.putExtra("descripcion",listLibros.get(recycler.getChildAdapterPosition(v)).getDescripcion());
                i.putExtra("imagen",listLibros.get(recycler.getChildAdapterPosition(v)).getFoto());
                startActivity(i);
            }
        });
        recycler.setAdapter(adapter);
    }

    private void llenarLibros(String nombre, ArrayList<Libro> libros) {
        for (Libro l:libros){
            if (l.getNombre().equals(nombre)){
                listLibros.add(new Libro(l.getNombre(), l.getAutor(), l.getEditorial(), l.getDescripcion(), l.getFoto(), l.getCategoria()));
            }
        }
    }
}