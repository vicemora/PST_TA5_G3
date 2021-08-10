package com.example.amst3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
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

        //manejador para el cambio de texto  de usuario (validar usuario)
        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
               //no es necesario
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {



            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    /**
     * Manejador de eventos para el botón registrarse
     * @param v
     */
    public void registrarse(View v){

        Database admin = new Database(this,
                "usuarios", null, 1);
        //Obteniendo base de datos en modo lectura
        SQLiteDatabase bd = admin.getWritableDatabase();

        //obtiene los datos pasados como parámetro por el usuario
        String username=et1.getText().toString();
        String password=et2.getText().toString();
        String correo=et3.getText().toString();
        String nombres=et4.getText().toString();
        String apellidos=et5.getText().toString();
        String celular=et6.getText().toString();
        String favorito=et7.getText().toString();

        bd.execSQL("insert into usuarios (nombre_usuario,contraseña,nombre,apellido,correo,celular,favorito) " +
                "values ('"+username+"','"+password+"','"+nombres+"','"+apellidos+"','"+correo+"','"+celular+"','"+favorito+"')");

        bd.close();
        //Alert dialog para indicar que el registro ha sido exitoso
        AlertDialog.Builder builder= new AlertDialog.Builder(RegisterActivity.this);
        builder.setTitle("¡Gracias por Unirse!").setMessage("Se ha registrado su cuenta con éxito").
                        setNeutralButton("Volver al inicio", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                 finish();
             }
        });
        AlertDialog alert=builder.create();
        alert.show();


    }

    /**
     * Verifica si un usuario se encuentra en la base de datos y devuelve un valor boleano
     * @param user
     * @return
     */
    private boolean usuarioRepetido(String user) {

        Database admin = new Database(this,
                "usuarios", null, 1);
        //Obteniendo base de datos en modo lectura
        SQLiteDatabase bd = admin.getReadableDatabase();
        //comprobando si el usuario ya existe
        Cursor fila = bd.rawQuery(
                "select nombre from usuarios where nombre_usuario='"+user+"'", null);
        bd.close();
        return fila.moveToFirst();

    }
    /*
    Método finish
     */
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slider_out_right);
    }

}