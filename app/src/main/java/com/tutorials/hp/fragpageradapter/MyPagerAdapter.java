package com.tutorials.hp.fragpageradapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 - Our MyPagerAdapter class.
 - Is our FragmentPagerAdapter class hence derives from android.support.v4.app.FragmentPagerAdapter.
 - Methods: getItem(),getCount(),getPageTitle(),addPage().
 - We define an arraylist to hold our pages/fragments here.
 - We define an addPage() method that takes a fragment object and adds it to our pages arraylist.
 - Our constructor takes a support FragmentManager object.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    //FRAGMENTS COLLECTION.
    ArrayList<Fragment> pages=new ArrayList<>();

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return pages.get(position);
    }

    @Override
    public int getCount() {
        return pages.size();
    }

    //FRAGMENT TITLE
    @Override
    public CharSequence getPageTitle(int position) {
        return pages.get(position).toString();
    }

    //ADD FRAGMENT TO COLLECTION.
    public void addPage(Fragment f)
    {
        pages.add(f);
    }
}
