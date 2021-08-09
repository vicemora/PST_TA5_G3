package com.example.amst3;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsuario,etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Drawable p, p_celeste, l, l_celeste;
        p = ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_person);
        p_celeste = ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_person_celeste);
        l = ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_lock);
        l_celeste = ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_lock_celeste);

        etUsuario=(EditText)findViewById(R.id.etUsuario);
        etUsuario.setCompoundDrawablesRelativeWithIntrinsicBounds(p, null, null, null);
        etPassword=(EditText)findViewById(R.id.etPassword);
        etPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(l, null, null, null);

        etUsuario.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                System.out.println("\nuseractual = " + etUsuario.getCompoundDrawablesRelative()[0]
                        + "\nuserLow = " + p
                        + "\nuserUp = " + p_celeste);
                if (etUsuario.getCompoundDrawablesRelative()[0] == p)
                    etUsuario.setCompoundDrawablesRelativeWithIntrinsicBounds(p_celeste, null, null, null);
                else
                    etUsuario.setCompoundDrawablesRelativeWithIntrinsicBounds(p, null, null, null);
            }
        });
        etPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                System.out.println("\npwactual = " + etPassword.getCompoundDrawablesRelative()[0]
                        + "\npwLow = " + l
                        + "\npwUp = " + l_celeste);
                if (etPassword.getCompoundDrawablesRelative()[0] == l)
                    etPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(l_celeste, null, null, null);
                else
                    etPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(l, null, null, null);
            }
        });


    }

    /**
     * Manejador para el boton iniciarsesion
     * @param V
     */
    public void IniciarSesion(View V){
        //Accediendo a la base de datos local
        Database admin = new Database(this,
                      "usuarios", null, 1);
        //Obteniendo base de datos en modo lectura
        SQLiteDatabase bd = admin.getReadableDatabase();
        //obteniendo usuario pasado en el editext
        String username = etUsuario.getText().toString();
        //se valida que el usuario exista, si existe se toma la contraseña, si no existe se muestr un toast
        Cursor fila = bd.rawQuery(
                "select contraseña from usuarios where nombre_usuario='" +username+"'",null);
        if (fila.moveToFirst()) {
            if(ValidarPass(fila.getString(0))){
                //Crear objeto usuario STATICO

            }else Toast.makeText(this, "Contraseña Incorrecta",
                                                                 Toast.LENGTH_SHORT).show();

        }else
            //enviando mensaje de toast a usuario en avisando de que el username es incorrecto
            Toast.makeText(this, "Nombre de usuario incorrecto",
                                                                    Toast.LENGTH_SHORT).show();
        bd.close();

    }

    /**
     * Manejador de eventos del botón registrarse envía al intent de registro
     * @param V
     */
    public void regitrarse(View V){
        //Enlazando con activity de pantalla de registro
        Intent i= new Intent(this,RegisterActivity.class);
        startActivity(i);
    }

    /**
     * Valida si la contraseña del usuario es igual a la pasada como parametro
     * @param password
     * @return
     */
    public boolean ValidarPass(String password){
            return password.equals(etPassword.getText().toString());
    }

    @Override
    public void onBackPressed () {
        //esto permite que el usuario no regrese a la pantalla de presentación
        moveTaskToBack(true);
    }


}