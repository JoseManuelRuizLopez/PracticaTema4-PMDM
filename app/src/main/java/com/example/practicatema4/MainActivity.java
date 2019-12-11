package com.example.practicatema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button btnUno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUno = (Button)findViewById(R.id.btnUno);

        //Boton uno
        btnUno.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), NumerosPrimos.class);
                startActivity(intent);
            }
        });

    }
}
