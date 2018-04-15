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
public class ShoeFragment extends Fragment {


    public ShoeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shoe, container, false);
    }

}
