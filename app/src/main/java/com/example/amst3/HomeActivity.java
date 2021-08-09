package com.example.amst3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
    private RecyclerView recycler;
    private SearchView svSearch;
    private RecyclerAdapter adapter;
    private ArrayList<Libro> listLibros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initViews();
        initValues();
        initListener();
        llenarLibros();

    }

    private void initViews(){
        recycler = (RecyclerView) findViewById(R.id.idRecycler);
        svSearch = (SearchView) findViewById(R.id.searchView);
    }

    private void initValues(){
        listLibros= new ArrayList<>();
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapter= new RecyclerAdapter(listLibros, this);
        recycler.setAdapter(adapter);
    }

    private void initListener() {
        svSearch.setOnQueryTextListener(this);
    }


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

    @Override
    public void itemClick(Libro libro) {
        Intent intent = new Intent(this, Descripcion.class);
        intent.putExtra("libroDetail", libro);
        startActivity(intent);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        adapter.filter(newText);
        return false;
    }
}