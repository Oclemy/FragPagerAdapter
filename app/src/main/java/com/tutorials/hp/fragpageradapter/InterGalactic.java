package com.tutorials.hp.fragpageradapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 - Intergalactic Fragment.
 - Derives from android.support.v4.app.Fragment.
 - We define a static method to return this current fragment.
 - Methods: newInstance(), onCreateView(),toString().
 */
public class InterGalactic extends Fragment {

    public static InterGalactic newInstance()
    {
        return new InterGalactic();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.intergalactic,null);
        return rootView;
    }

    @Override
    public String toString() {
        return "InterGalactic";
    }
}
