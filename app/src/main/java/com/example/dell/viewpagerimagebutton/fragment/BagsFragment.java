package com.example.dell.viewpagerimagebutton.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.viewpagerimagebutton.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BagsFragment extends Fragment {


    public BagsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bags, container, false);
    }

}