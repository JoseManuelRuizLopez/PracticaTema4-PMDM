package com.example.practicatema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button btnUno;
Button btnDos;
Button btnTres;
Button btnCuatro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUno = (Button)findViewById(R.id.btnUno);
        btnDos = (Button)findViewById(R.id.btnDos);
        btnTres = (Button)findViewById(R.id.btnTres);
        btnCuatro = (Button)findViewById(R.id.btnCuatro);

        //Boton uno
        btnUno.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), NumerosPrimos.class);
                startActivity(intent);
            }
        });

        //botón dos
        btnDos.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), JuegoAciertos.class);
                startActivity(intent);
            }
        });

        //botón tres
        btnTres.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DesplazandoImagenes.class);
                startActivity(intent);
            }
        });

        //botón cuatro
        btnCuatro.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

    }
}
