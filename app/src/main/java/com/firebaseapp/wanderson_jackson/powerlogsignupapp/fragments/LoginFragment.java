package com.firebaseapp.wanderson_jackson.powerlogsignupapp.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.firebaseapp.wanderson_jackson.powerlogsignupapp.EsqueciSenhaActivity;
import com.firebaseapp.wanderson_jackson.powerlogsignupapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.login_layout, null);
        Button btn_forgot = view.findViewById(R.id.btn_esqueci_senha);
        btn_forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), EsqueciSenhaActivity.class));
            }
        });




        return  view;
    }

}
