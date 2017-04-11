package com.example.dinesh.finalproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.OnClick;

import static com.example.dinesh.finalproject.R.id.dialog_OK;

public class RadioBoxFragment extends Fragment {

    private int checkedID;
    private final int DIALOG = 12345;

    @BindView(R.id.rdg)

    RadioGroup radioGroup;

    @OnClick(dialog_OK)
    public void okClick() {
        switch (checkedID) {
            case R.id.button1:

                break;
            case R.id.button2:

                break;
            case R.id.button3:

                break;
            case R.id.dialog_CANCEL:

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
