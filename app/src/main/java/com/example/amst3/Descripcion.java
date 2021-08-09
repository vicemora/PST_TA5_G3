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
        Bundle bundle = getIntent().getExtras();
        TextView nombre = (TextView) findViewById(R.id.idNombreDescripcion);
        TextView descripcion = (TextView) findViewById(R.id.idDescripcionDescripcion);
        ImageView imagen = (ImageView) findViewById(R.id.idImagenDescripcion);
        nombre.setText(bundle.getString("nombre"));
        descripcion.setText(bundle.getString("descripcion"));
        imagen.setImageResource(bundle.getInt("imagen"));
    }
}