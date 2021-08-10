package com.example.amst3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {
    Usuario user = new Usuario("carlossteven9xd", "Carlos","Cordero", "carlossteven9xd@gmail.com", "+19294084848");
    String username = user.getUsername();
    String nombre = user.getNombre();
    String apellido = user.getApellido();
    String correo = user.getCorreo();
    String celular = user.getCelular();
    TextView username2;
    TextView nombre2 ;
    TextView apellido2 ;
    TextView correo2 ;
    TextView celular2 ;

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
