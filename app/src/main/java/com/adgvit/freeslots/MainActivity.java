package com.adgvit.freeslots;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarFreeSlots);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Free Slots");
        viewPager = (ViewPager) findViewById(R.id.freeSlotPager);
        FreeSlotFragmentAdapter adapter = new FreeSlotFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabs = (TabLayout) findViewById(R.id.tabsDays);
        tabs.setupWithViewPager(viewPager);
    }
}
