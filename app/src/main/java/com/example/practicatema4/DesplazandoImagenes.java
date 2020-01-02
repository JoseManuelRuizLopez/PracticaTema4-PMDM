package com.example.practicatema4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class DesplazandoImagenes extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplazando_imagenes);

        viewPager = findViewById(R.id.viewpager);

        viewPager.setAdapter(new ViewpagerDesplazandoImagenes(getSupportFragmentManager()));
    }
}
