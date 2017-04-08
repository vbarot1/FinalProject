package com.example.dinesh.finalproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class DialogBoxFragment extends Fragment {

    Button mShowDialog;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mShowDialog = (Button) this.getActivity().findViewById(R.id.btnShowDialog);


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dialog_box, container, false);
    }




}