package com.example.android.centrallibrarytour;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Use main_activity.xml as layout
        setContentView(R.layout.activity_main);

        //View Pager to allow navigation between each floor's details
        ViewPager viewPager = findViewById(R.id.view_pager);

        // Create an adapter that knows which floor fragment should be shown on each page in viewPager
        FloorAdapter adapter = new FloorAdapter(this, getSupportFragmentManager());

        // Set the adapter created above to point to the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.floor_tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
    }
}
