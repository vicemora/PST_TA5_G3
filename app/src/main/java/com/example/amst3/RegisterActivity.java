package com.example.amst3;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    //Declarando los edittext
    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;
    EditText et5;
    EditText et6;
    EditText et7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //Username
        et1=(EditText)findViewById(R.id.et1);
        //Contraseña
        et2=(EditText)findViewById(R.id.et2);
        //correo
        et3=(EditText)findViewById(R.id.et3);
        //nombres
        et4=(EditText)findViewById(R.id.et4);
        //apellidos
        et5=(EditText)findViewById(R.id.et5);
        //celular
        et6=(EditText)findViewById(R.id.et6);
        //favorito
        et7=(EditText)findViewById(R.id.et7);


    }


    public void registrarse(View v){

        Database admin = new Database(this,
                "usuarios", null, 1);
        //Obteniendo base de datos en modo lectura
        SQLiteDatabase bd = admin.getWritableDatabase();

        String username=et1.getText().toString();
        String password=et2.getText().toString();
        String correo=et3.getText().toString();
        String nombres=et4.getText().toString();
        String apellidos=et5.getText().toString();
        String celular=et6.getText().toString();
        String favorito=et7.getText().toString();

        bd.execSQL("insert into usuarios (nombre_usuario,contraseña,nombre,apellido,correo,celular,favorito) " +
                "values ('"+username+"','"+password+"','"+nombres+"','"+apellidos+"','"+correo+"','"+celular+"','"+favorito+"')");

        Toast.makeText(this, "Se cargaron los datos del artículo",
                Toast.LENGTH_SHORT).show();
        bd.close();
    }






}