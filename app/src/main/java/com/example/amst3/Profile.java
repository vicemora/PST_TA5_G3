package com.example.amst3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    String username = LoginActivity.user.getUsername();
    String nombre = LoginActivity.user.getNombre();
    String apellido = LoginActivity.user.getApellido();
    String correo = LoginActivity.user.getCorreo();
    String celular = LoginActivity.user.getCelular();
    TextView username2;
    TextView nombre2 ;
    TextView apellido2 ;
    TextView correo2 ;
    TextView celular2 ;
    private ImageButton catButton, homeButton, carButton;

    ImageView mImageView;
    Button mChooseBtn;

    private static final int IMAGE_PICK_CODE = 1000;
    private static final int PERMISSION_CODE = 1001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        username2= findViewById(R.id.usuario);
        nombre2 =(TextView) findViewById(R.id.nombre);
        apellido2 = (TextView) findViewById(R.id.apellido);
        correo2 = (TextView) findViewById(R.id.correo);
        celular2 = (TextView) findViewById(R.id.telefono);
        username2.setText(username);
        nombre2.setText(nombre);
        apellido2.setText(apellido);
        correo2.setText(correo);
        celular2.setText(celular);
        mImageView = (ImageView) findViewById(R.id.foto_perfil);
        mChooseBtn = (Button) findViewById(R.id.boton);

        catButton = (ImageButton) findViewById(R.id.cat_btn);
        homeButton = (ImageButton) findViewById(R.id.home_btn);
        carButton = (ImageButton) findViewById(R.id.car_btn);

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
        carButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });
    }
    private void pickImageGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, IMAGE_PICK_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case PERMISSION_CODE: {
                if (grantResults.length > 0 && grantResults[0] ==
                        PackageManager.PERMISSION_GRANTED) {
                    pickImageGallery();
                } else {
                    Toast.makeText(this, "El permiso ha sido denegado", Toast.LENGTH_SHORT).show();
                }
            }

        }
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == IMAGE_PICK_CODE) {
            mImageView.setImageURI(data.getData());
        }
    }
    public void volver(View view){

    }
    public void cerrar(View view){
        LoginActivity.user = null;
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
    public void cambiar(View view){
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED){
                String[] permissions = {Manifest.permission.READ_EXTERNAL_STORAGE};
                requestPermissions(permissions, PERMISSION_CODE); }
            else{
                pickImageGallery();
            }}
        else{
            pickImageGallery();
        }

    }
}
