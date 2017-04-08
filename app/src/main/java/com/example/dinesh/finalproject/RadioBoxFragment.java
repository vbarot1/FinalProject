package com.example.dinesh.finalproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.OnClick;

public class RadioBoxFragment extends Fragment {

    private int checkedID;
    private final int DIALOG = 12345;


    @BindView(R.id.rdg)

    RadioGroup radioGroup;

    @OnClick(R.id.dialog_OK)
    public void okClick() {
        switch (checkedID) {
            case R.id.radio_pirates:

                break;
            case R.id.radio_ninjas:

            case R.id.dialog_CANCEL:

                break;
            case R.id.dialog_OK:

                break;


        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_radio_box, container, false);
    }

}
