package com.example.android.centrallibrarytour;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Use main_activity.xml as layout
        setContentView(R.layout.activity_main);

        //View Pager to allow navigation between each floor's details
        ViewPager viewPager = findViewById(R.id.view_pager);

        // Create an adapter that knows which floor fragment should be shown on each page in viewPager
        FloorAdapter adapter = new FloorAdapter(getSupportFragmentManager());

        // Set the adapter created above to point to the view pager
        viewPager.setAdapter(adapter);
    }
}
