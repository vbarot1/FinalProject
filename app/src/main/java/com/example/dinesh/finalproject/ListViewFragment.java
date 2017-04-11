package com.example.dinesh.finalproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //cals function, which goes to function, that shows elements want to display, set up adapter, and use ListView
        View mView = inflater.inflate(R.layout.fragment_list_view, container, false);


        String[] items = {"One", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen","fifteen","sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty-one", "twenty-two",
                "twenty-three", "twenty-four", "twenty-five", "twenty-six",
        "twenty-seven", "twenty-eight", "twenty-nine", "thirty", "thirty-one", "thirty-two", "thirty-three", "thirty-four", "thirty-five",
        "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty", "forty-one", "forty-two", "forty-three", "forty-four",
        "forty-five", "forty-six", "forty-seven", "forty-eight", "forty-nine", "fifty"};

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, items);

        ListView lv = (ListView) mView.findViewById(R.id.listView);
        lv.setAdapter(itemsAdapter);


        return mView;

    }

}
