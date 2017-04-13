package com.example.dinesh.finalproject;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

    ViewPager mPager;
    PagerAdapter mAdapter;

    Button dfragbutton;
    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //tells next line where to go
        setContentView(R.layout.activity_main);


        mPager = (ViewPager) findViewById(R.id.finalViewPager); //gives a reference to the pager
        mAdapter = new PageFragmentAdapter(getSupportFragmentManager());
        mPager.setAdapter(mAdapter); //how the pages are supplied: via the adapter
        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.shape);
        mediaPlayer.start();
    }



}

class PageFragmentAdapter extends FragmentStatePagerAdapter {

    public PageFragmentAdapter(FragmentManager fm) {
        super(fm); //constructor that gives us the fragment manager
    }

    //controls which fragment will go on which page as swiped from left to right
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ListViewFragment();
        } else if (position == 1) {
            return new DialogBoxFragment();
        } else if (position == 2) {
            return new RadioBoxFragment();
        } else if (position == 3) {
            return new BundleFragment();
        } else if (position == 4) {
            return new AnimationFragment();
        }else {
            return new ViewFragment();
        }
    }

    @Override
    public int getCount() {
        return 5; //how many slides we want
    }
}
