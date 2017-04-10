package com.example.dinesh.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;


public class Bundle2 extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bundle2);

        TextView textView = (TextView) findViewById(R.id.textView_display);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        String name = bundle.getString("myname");

        textView.setText(name);
    }
}
