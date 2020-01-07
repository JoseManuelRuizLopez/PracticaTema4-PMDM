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

        return view;
    }
}
