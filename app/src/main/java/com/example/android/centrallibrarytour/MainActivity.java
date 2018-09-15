package com.example.android.centrallibrarytour;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;
/*CODE SOURCE AND PERMISSIONS
* The implementation for the ListView, MenuAdapter, ArrayAdapter, Fragments, and tabLayout were adapted from examples from the Miwok app in the Udacity Nanodegree.
* The source code for that project can be found here: https://github.com/udacity/ud839_Miwok/tree/lesson-one/app/src/main/java/com/example/android/miwok
* AND from the AudioBook App (created by this app's author Marianne McKenzie) for the Udacity nanodegree whose source code can be found here: https://github.com/memckenzie2/AudiobookApp
*/

/* PERMISSIONS AND COPYRIGHT FOR IMAGES AND TEXT
* Images and text descriptions for Central Library are used with limited permission for academic use from the
* Indianapolis Public Library - this permission is granted only to the employee Marianne McKenzie.
* Images and text may not be reproduced by any other individual without prior written permission from the
* Indianapolis Public Library: http://www.indypl.org/about/contact/ */


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

        // Find the tab layout that shows the tabs for each floor fragment
        TabLayout tabLayout = (TabLayout) findViewById(R.id.floor_tabs);

        // Connect the tab layout with the view pager. This allows for swiping and updating the tabLayouts header to hilight the
        //current floor's tab
        tabLayout.setupWithViewPager(viewPager);
    }
}
