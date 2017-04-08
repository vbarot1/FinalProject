package com.example.dinesh.finalproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DialogBoxFragment extends Fragment {

   /* final Context context = this;
    private Button button;*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      /*  // Inflate the layout for this fragment
        getDialog().setTitle("Simple Dialog");*/
        return inflater.inflate(R.layout.fragment_dialog_box, container, false);
    }
}
