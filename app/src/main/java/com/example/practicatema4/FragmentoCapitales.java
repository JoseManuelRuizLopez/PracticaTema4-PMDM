package com.example.practicatema4;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentoCapitales extends Fragment {


    public FragmentoCapitales() {
        // Required empty public constructor
    }

    String [] arrayCapitales;
    ListView listaCapitales;
    ArrayAdapter<String> ListViewAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragmento_capitales, container, false);
        arrayCapitales = getResources().getStringArray(R.array.listaCapitales);
        listaCapitales = view.findViewById(R.id.listViewCapitales);
        ListViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, arrayCapitales);

        listaCapitales.setAdapter(ListViewAdapter);
        listaCapitales.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String capitalElegida = "";
                switch (position) {
                    case 0:
                        capitalElegida = arrayCapitales[0];
                        break;
                    case 1:
                        capitalElegida = arrayCapitales[1];
                        break;
                    case 2:
                        capitalElegida = arrayCapitales[2];
                        break;
                    case 3:
                        capitalElegida = arrayCapitales[3];
                        break;
                    case 4:
                        capitalElegida = arrayCapitales[4];
                        break;
                    case 5:
                        capitalElegida = arrayCapitales[5];
                        break;
                    case 6:
                        capitalElegida = arrayCapitales[6];
                        break;
                    case 7:
                        capitalElegida = arrayCapitales[7];
                        break;
                    case 8:
                        capitalElegida = arrayCapitales[8];
                        break;
                    case 9:
                        capitalElegida = arrayCapitales[9];
                        break;
                    case 10:
                        capitalElegida = arrayCapitales[10];
                        break;

                }
            }
        });
        return view;
    }
}
