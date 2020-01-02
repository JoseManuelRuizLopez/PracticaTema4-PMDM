package com.example.practicatema4;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewpagerDesplazandoImagenes extends FragmentPagerAdapter {


    public ViewpagerDesplazandoImagenes(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return  new FragmentoImagen1();
            case 1:
                return  new FragemntoImagen2();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
