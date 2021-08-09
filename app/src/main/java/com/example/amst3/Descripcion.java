package com.example.amst3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Descripcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);
        Libro libro = (Libro) getIntent().getExtras().get("libroDetail");
        System.out.println(libro.getNombre());
        TextView nombre = (TextView) findViewById(R.id.idNombreDescripcion);
        TextView descripcion = (TextView) findViewById(R.id.idDescripcionDescripcion);
        ImageView imagen = (ImageView) findViewById(R.id.idImagenDescripcion);
        nombre.setText(libro.getNombre());
        descripcion.setText(libro.getDescripcion());
        imagen.setImageResource(libro.getFoto());
    }
}