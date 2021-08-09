package com.example.amst3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ArrayList<Libro> listLibros;
    RecyclerView recycler;
    SearchView svSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recycler= (RecyclerView) findViewById(R.id.idRecycler);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        listLibros= new ArrayList<>();
        llenarLibros();
        AdapterDatos adapter= new AdapterDatos(listLibros);
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Descripcion.class);
                i.putExtra("nombre",listLibros.get(recycler.getChildAdapterPosition(v)).getNombre());
                i.putExtra("descripcion",listLibros.get(recycler.getChildAdapterPosition(v)).getDescripcion());
                i.putExtra("imagen",listLibros.get(recycler.getChildAdapterPosition(v)).getFoto());
                startActivity(i);
                //Toast.makeText(getApplicationContext() ,
                        //listLibros.get(recycler.getChildAdapterPosition(v)).getNombre(), Toast.LENGTH_SHORT).show();
            }
        });
        recycler.setAdapter(adapter);
    }

   /*public void buscar(View view) {
        EditText etBuscar = (EditText) findViewById(R.id.etBuscar); //se enlaza con el obj del diseño
        Intent busqueda = new Intent(this, Busqueda.class ); //se crea para ir a otro activity
        busqueda.putExtra("nombreBusqueda", etBuscar.getText().toString()); //se agregan las variables que se quieren enviar al activity
        Bundle bundle=new Bundle();
        bundle.putSerializable("libros",listLibros);
        busqueda.putExtras(bundle);
        startActivity(busqueda); //se abre el activity
    }*/



    private void llenarLibros() {
        listLibros.add(new Libro("libro1", "yo pues", "prueba", "descrip", R.drawable.bart, "categoria"));
        listLibros.add(new Libro("libro2", "yo pues", "prueba", "descrip", R.drawable.burns, "categoria"));
        listLibros.add(new Libro("libro3", "yo pues", "prueba", "descrip", R.drawable.flanders, "categoria"));
        listLibros.add(new Libro("libro1", "yo pues", "prueba", "descrip", R.drawable.bart, "categoria"));
        listLibros.add(new Libro("libro2", "yo pues", "prueba", "descrip", R.drawable.burns, "categoria"));
        listLibros.add(new Libro("libro3", "yo pues", "prueba", "descrip", R.drawable.flanders, "categoria"));
        listLibros.add(new Libro("libro1", "yo pues", "prueba", "descrip", R.drawable.bart, "categoria"));
        listLibros.add(new Libro("libro2", "yo pues", "prueba", "descrip", R.drawable.burns, "categoria"));
        listLibros.add(new Libro("libro3", "yo pues", "prueba", "descrip", R.drawable.flanders, "categoria"));
        listLibros.add(new Libro("libro1", "yo pues", "prueba", "descrip", R.drawable.bart, "categoria"));
        listLibros.add(new Libro("libro2", "yo pues", "prueba", "descrip", R.drawable.burns, "categoria"));
        listLibros.add(new Libro("libro3", "yo pues", "prueba", "descrip", R.drawable.flanders, "categoria"));
        listLibros.add(new Libro("libro1", "yo pues", "prueba", "descrip", R.drawable.bart, "categoria"));
        listLibros.add(new Libro("libro2", "yo pues", "prueba", "descrip", R.drawable.burns, "categoria"));
        listLibros.add(new Libro("libro3", "yo pues", "prueba", "descrip", R.drawable.flanders, "categoria"));

    }
}