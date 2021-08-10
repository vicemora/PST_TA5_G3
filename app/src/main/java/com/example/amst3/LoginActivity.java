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
    public static Usuario user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsuario=(EditText)findViewById(R.id.etUsuario);
        etPassword=(EditText)findViewById(R.id.etPassword);

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
                "select nombre_usuario,contraseña,nombre,apellido,correo,celular,favorito" +
                        " from usuarios where nombre_usuario='" +username+"'",null);
        if (fila.moveToFirst()) {
            if(ValidarPass(fila.getString(1))){
                //Crear objeto usuario STATICO del usuario LOGEADO
                user=new Usuario(fila.getString(0),fila.getString(2),
                        fila.getString(3),fila.getString(4),fila.getString(5));
                //Accediendo al HOME con user LOG
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
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