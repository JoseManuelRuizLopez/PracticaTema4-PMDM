package com.example.practicatema4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;

public class JuegoAciertos extends AppCompatActivity {


    Fragment fragPais;
    ListView listPais;
    TextView lblPais;

    Fragment fragCapital;
    ListView listCapital;
    TextView lblCapital;

    Button btnVerificar;
    Fragment fragCorrecto;
    Fragment fragIncorrecto;

    int posP;
    int posC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_aciertos);

        btnVerificar = (Button) findViewById(R.id.btnVerificar);

        lblPais = (TextView) findViewById(R.id.lblPais);
        fragPais = (Fragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        listPais = fragPais.getActivity().findViewById(R.id.listVewPais);

        lblCapital = (TextView) findViewById(R.id.lblCapital);
        fragCapital = (Fragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        listCapital = fragCapital.getActivity().findViewById(R.id.listViewCapitales);

        //Lista pais
        listPais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String paisElegido = "";
                String[] arrayPaises = getResources().getStringArray(R.array.listaPaises);
                switch (position) {
                    case 0:
                        paisElegido = arrayPaises[0];
                        posP = 0;
                        break;
                    case 1:
                        paisElegido = arrayPaises[1];
                        posP = 1;
                        break;
                    case 2:
                        paisElegido = arrayPaises[2];
                        posP = 2;
                        break;
                    case 3:
                        paisElegido = arrayPaises[3];
                        posP = 3;
                        break;
                    case 4:
                        paisElegido = arrayPaises[4];
                        posP = 4;
                        break;
                    case 5:
                        paisElegido = arrayPaises[5];
                        posP = 5;
                        break;
                    case 6:
                        paisElegido = arrayPaises[6];
                        posP = 6;
                        break;
                    case 7:
                        paisElegido = arrayPaises[7];
                        posP = 7;
                        break;
                    case 8:
                        paisElegido = arrayPaises[8];
                        posP = 8;
                        break;
                    case 9:
                        paisElegido = arrayPaises[9];
                        posP = 9;
                        break;
                    case 10:
                        paisElegido = arrayPaises[10];
                        posP = 10;
                        break;
                }
                lblPais.setText(paisElegido);
            }
        });

        //Lista capitales
        listCapital.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String capitalElegida = "";
                String[] arrayCapitales = getResources().getStringArray(R.array.listaCapitales);
                switch (position) {
                    case 0:
                        capitalElegida = arrayCapitales[0];
                        posC = 0;
                        break;
                    case 1:
                        capitalElegida = arrayCapitales[1];
                        posC = 1;
                        break;
                    case 2:
                        capitalElegida = arrayCapitales[2];
                        posC = 2;
                        break;
                    case 3:
                        capitalElegida = arrayCapitales[3];
                        posC = 3;
                        break;
                    case 4:
                        capitalElegida = arrayCapitales[4];
                        posC = 4;
                        break;
                    case 5:
                        capitalElegida = arrayCapitales[5];
                        posC = 5;
                        break;
                    case 6:
                        capitalElegida = arrayCapitales[6];
                        posC = 6;
                        break;
                    case 7:
                        capitalElegida = arrayCapitales[7];
                        posC = 7;
                        break;
                    case 8:
                        capitalElegida = arrayCapitales[8];
                        posC = 8;
                        break;
                    case 9:
                        capitalElegida = arrayCapitales[9];
                        posC = 9;
                        break;
                    case 10:
                        capitalElegida = arrayCapitales[10];
                        posC = 10;
                        break;

                }
                lblCapital.setText(capitalElegida);
            }
        });

        btnVerificar.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pais = lblPais.getText().toString();
                String capital = lblCapital.getText().toString();

                if(posP == posC)
                {
                    fragCorrecto = new FragmentoCorrecto();
                    FragmentTransaction transacction = getSupportFragmentManager().beginTransaction();
                    transacction.add(R.id.contenedor, fragCorrecto);
                    transacction.commit();
                }
                else
                {
                    fragIncorrecto = new FragmentoIncorrecto();
                    FragmentTransaction transacction = getSupportFragmentManager().beginTransaction();
                    transacction.add(R.id.contenedor, fragIncorrecto);
                    transacction.commit();

                }
            }
        });
    }
}
