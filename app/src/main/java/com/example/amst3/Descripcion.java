package com.example.amst3;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Descripcion extends AppCompatActivity {

    float x1,x2,y1,y2;
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

    /**
     * Touch event para cerrar de manera dinamica la ventana de descricion
     * @param touchEvent
     * @return
     */
    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1  < x2){
                finish();
            }
            break;
        }
        return false;
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slider_out_right);
    }
}