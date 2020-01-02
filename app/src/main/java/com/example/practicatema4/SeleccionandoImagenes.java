package com.example.practicatema4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeleccionandoImagenes extends AppCompatActivity {

    Button btnLirio;
    Button btnPetunia;
    Button btnDalia;
    Button btnOrquidea;

    Fragment fragmentoLirio;
    Fragment fragmentoPetunia;
    Fragment fragmentoDalia;
    Fragment fragmentoOrquidea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionando_imagenes);

        btnLirio = (Button)findViewById(R.id.btnLirio);
        btnDalia = (Button)findViewById(R.id.btnDalia);
        btnPetunia = (Button)findViewById(R.id.btnPetunia);
        btnOrquidea = (Button)findViewById(R.id.btnOrquidea);

        btnLirio.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                fragmentoLirio = new FragmentoLirio();
                FragmentTransaction transacction = getSupportFragmentManager().beginTransaction();
                transacction.add(R.id.contenedor, fragmentoLirio);
                transacction.commit();
            }
        });

        btnPetunia.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                fragmentoPetunia = new FragentoPetunia();
                FragmentTransaction transacction = getSupportFragmentManager().beginTransaction();
                transacction.add(R.id.contenedor, fragmentoPetunia);
                transacction.commit();
            }
        });

        btnDalia.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                fragmentoDalia= new FragmentoDalia();
                FragmentTransaction transacction = getSupportFragmentManager().beginTransaction();
                transacction.add(R.id.contenedor, fragmentoDalia);
                transacction.commit();
            }
        });

        btnOrquidea.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                fragmentoOrquidea = new FragmentoOrquidea();
                FragmentTransaction transacction = getSupportFragmentManager().beginTransaction();
                transacction.add(R.id.contenedor, fragmentoOrquidea);
                transacction.commit();
            }
        });

    }
}
