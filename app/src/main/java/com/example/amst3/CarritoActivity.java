package com.example.amst3;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class CarritoActivity extends AppCompatActivity implements RecyclerAdapterCarrito.RecyclerItemClick {
    private RecyclerView recycler;
    private RecyclerAdapterCarrito adapter;
    private ArrayList<Libro> listLibrosCarrito;
    private ImageButton catButton, homeButton, profileButton;
    private TextView costoText;
    private String strCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        initViews();
        initValues();
    }


    private void initViews(){
        recycler = (RecyclerView) findViewById(R.id.idRecycler);

        costoText = (TextView) findViewById((R.id.idCostoTotal));
        costoText.setText("$" + String.valueOf(Carrito.getCosto()));

        Drawable rect, rect_celeste;
        rect = ContextCompat.getDrawable(getApplicationContext(), R.drawable.rec);
        rect_celeste = ContextCompat.getDrawable(getApplicationContext(), R.drawable.rec_celeste);

        catButton = (ImageButton) findViewById(R.id.cat_btn);
        homeButton = (ImageButton) findViewById(R.id.home_btn);
        profileButton = (ImageButton) findViewById(R.id.profile_btn);
        catButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Categorias.class ); //se crea para ir a otro activity
                startActivity(i); //se abre el activity
            }
        });
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Profile.class); //se crea para ir a otro activity
                startActivity(i); //se abre el activity
            }
        });
    }

    private void initValues(){
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        listLibrosCarrito = Carrito.librosCarrito;

        adapter = new RecyclerAdapterCarrito(listLibrosCarrito, this, costoText);
        recycler.setAdapter(adapter);
    }

    @Override
    public void itemClick(Libro libro) {
        Intent intent = new Intent(this, Descripcion.class);
        intent.putExtra("libroDetail", libro);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slider_out_left);
    }
}