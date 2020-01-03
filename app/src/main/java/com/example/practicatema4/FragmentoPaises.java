package com.example.practicatema4;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentoPaises extends Fragment {


    public FragmentoPaises() {
        // Required empty public constructor
    }

    String [] arrayPaises;
    ListView listaPaises;
    ArrayAdapter<String> ListViewAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fragmento_paises, container, false);
        arrayPaises = getResources().getStringArray(R.array.listaPaises);
        listaPaises = view.findViewById(R.id.listVewPais);
        ListViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,arrayPaises);

        listaPaises.setAdapter(ListViewAdapter);
        listaPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String paisElegido = "";
                switch (position) {
                    case 0:
                        paisElegido = arrayPaises[0];
                        break;
                    case 1:
                        paisElegido = arrayPaises[1];
                        break;
                    case 2:
                        paisElegido = arrayPaises[2];
                        break;
                    case 3:
                        paisElegido = arrayPaises[3];
                        break;
                    case 4:
                        paisElegido = arrayPaises[4];
                        break;
                    case 5:
                        paisElegido = arrayPaises[5];
                        break;
                    case 6:
                        paisElegido = arrayPaises[6];
                        break;
                    case 7:
                        paisElegido = arrayPaises[7];
                        break;
                    case 8:
                        paisElegido = arrayPaises[8];
                        break;
                    case 9:
                        paisElegido = arrayPaises[9];
                        break;
                    case 10:
                        paisElegido = arrayPaises[10];
                        break;

                }
            }
        });
        return view;
    }

}
