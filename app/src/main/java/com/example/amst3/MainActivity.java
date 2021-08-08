package com.example.amst3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Activity para la pantalla de inicio de sesión
 */
public class MainActivity extends AppCompatActivity {

    //variable estática para controlar el timing de la SplasnScreen
    public static int SPLASH_SCREEN_TIME=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Manejador para el timer del splashscreen
        new Handler().postDelayed(new Runnable() {
            //Se sobrescribe el método run de la interfaz Runnable
            @Override
            public void run() {
                //Intent hacia LoginScreen
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        },SPLASH_SCREEN_TIME);
    }
}

