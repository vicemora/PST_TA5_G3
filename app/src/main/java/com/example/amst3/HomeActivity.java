package com.example.amst3;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SearchView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
    private RecyclerView recycler;
    private SearchView svSearch;
    private boolean enHome = true;

    private ImageButton catButton, homeButton, carButton, profileButton;

    private RecyclerAdapter adapter;
    private ArrayList<Libro> listLibros;
    private String strCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            Bundle bundle= getIntent().getExtras();
            listLibros = (ArrayList<Libro>) bundle.getSerializable("librosCat");
            strCat = bundle.getString("strCat");

        } catch (NullPointerException e) {
            listLibros = null;
            strCat=null;
        }

        setContentView(R.layout.activity_home);

        initViews();
        initValues();
        initListener();

    }

    private void initViews(){
        recycler = (RecyclerView) findViewById(R.id.idRecycler);

        Drawable rect, rect_celeste;
        rect = ContextCompat.getDrawable(getApplicationContext(), R.drawable.rec);
        rect_celeste = ContextCompat.getDrawable(getApplicationContext(), R.drawable.rec_celeste);
        svSearch = (SearchView) findViewById(R.id.searchView);
        svSearch.setBackground(rect);

        svSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svSearch.setIconified(false);
                svSearch.setBackground(rect_celeste);
            }
        });
        svSearch.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                svSearch.setBackground(rect);
                return false;
            }
        });

        catButton = (ImageButton) findViewById(R.id.cat_btn);
        homeButton = (ImageButton) findViewById(R.id.home_btn);
        carButton = (ImageButton) findViewById(R.id.car_btn);
        profileButton = (ImageButton) findViewById(R.id.profile_btn);
        catButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Categorias.class ); //se crea para ir a otro activity
                Bundle bundle=new Bundle();
                bundle.putSerializable("libros",listLibros);
                i.putExtras(bundle);
                startActivity(i); //se abre el activity
            }
        });
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!enHome) {
                    Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(intent);
                }
            }
        });
        carButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void initValues(){
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        System.out.println(listLibros == null);
        if (listLibros == null){
            listLibros = new ArrayList<>();
            listLibros=Libro.listLibrosDatos;
        }else{
            enHome = false;
            homeButton.setImageResource(R.drawable.ic_home);
            catButton.setImageResource(R.drawable.ic_cat_celeste);
            this.setTitle("Libros de "+strCat);
        }
        System.out.println(listLibros);
        adapter = new RecyclerAdapter(listLibros, this);
        recycler.setAdapter(adapter);
    }

    private void initListener() {
        svSearch.setOnQueryTextListener(this);
    }

    @Override
    public void itemClick(Libro libro) {
        Intent intent = new Intent(this, Descripcion.class);
        intent.putExtra("libroDetail", libro);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slider_out_left);
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