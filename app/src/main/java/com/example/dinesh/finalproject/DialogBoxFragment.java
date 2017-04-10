package com.example.dinesh.finalproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DialogBoxFragment extends DialogFragment {

    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

       final FragmentManager fm = getFragmentManager();


        btn = (Button) view.findViewById(R.id.btnShowDialog);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setMessage("This is the pop button that appears when 'Show Dialog' is clicked");
                alertDialogBuilder.show();

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      /*  // Inflate the layout for this fragment
        getDialog().setTitle("Simple Dialog");*/



        return inflater.inflate(R.layout.fragment_dialog_box, container, false);
    }
}
