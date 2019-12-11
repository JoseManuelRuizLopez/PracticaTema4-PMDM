package com.example.practicatema4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumerosPrimos extends AppCompatActivity {

    Button btnCalcular;
    EditText txtNumero;
    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_primos);

        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        txtNumero = (EditText) findViewById(R.id.txtNumero);
        lblResultado = (TextView) findViewById(R.id.lblResultado);

        btnCalcular.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                int contador = 0;
                int numero = Integer.parseInt(txtNumero.getText().toString());

                for(int i = 1; i <= numero; i++)
                {
                    if((numero % i) == 0)
                    {
                        contador++;
                    }
                }

                if(contador <= 2)
                {
                    lblResultado.setText(getString(R.string.resultadoPt1) + " " + numero + " " + getString(R.string.resultadoPrimo));
                }
                else
                {
                    lblResultado.setText(getString(R.string.resultadoPt1) + " " + numero + " " + getString(R.string.resultadoNoPrimo));
                }
            }
        });
    }
}
