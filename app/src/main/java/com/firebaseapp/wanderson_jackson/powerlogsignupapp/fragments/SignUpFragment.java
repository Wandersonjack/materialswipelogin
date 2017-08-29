package com.firebaseapp.wanderson_jackson.powerlogsignupapp.fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.firebaseapp.wanderson_jackson.powerlogsignupapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {




    public SignUpFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.signup_layout, container, false);
        return view;

    }



}
