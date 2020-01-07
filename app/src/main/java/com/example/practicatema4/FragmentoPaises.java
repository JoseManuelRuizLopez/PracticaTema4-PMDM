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

        return view;
    }

}
