package com.example.benchmarksgit;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.benchmarksgit.ui_fragments.CollectionsFragment;
import com.example.benchmarksgit.ui_fragments.MapsFragment;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String[] namesOfTabs = {"Collections", "Maps"};

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 1:
                return new MapsFragment();
        }
        return new CollectionsFragment();
    }

    @Override
    public int getCount() {
        return namesOfTabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return namesOfTabs[position];
    }
}
