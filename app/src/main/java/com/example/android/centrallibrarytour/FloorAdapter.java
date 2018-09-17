package com.example.android.centrallibrarytour;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.centrallibrarytour.FloorCretFragment;
import com.example.android.centrallibrarytour.FloorFiveFragment;
import com.example.android.centrallibrarytour.FloorFourFragment;
import com.example.android.centrallibrarytour.FloorOneFragment;
import com.example.android.centrallibrarytour.FloorSixFragment;
import com.example.android.centrallibrarytour.FloorThreeFragment;
import com.example.android.centrallibrarytour.FloorTwoFragment;

public class FloorAdapter extends FragmentPagerAdapter{
    private Context myContext;
    public FloorAdapter(Context context,FragmentManager fm) {
        super(fm);
        myContext = context;
    }

    //Points each position to the appropriate floor starting with the "main floor" (2nd) at 0, then the "old library" (the cret) at 1, then 1st-6th
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            //The main floor fragment (2nd floor)
            return new FloorTwoFragment();
        }
        else if (position == 1){
            //The "old library" - the Cret fragment
            return new FloorCretFragment();
        }else if (position == 2){
            //The "basement" floor - floor 1 fragment
            return new FloorOneFragment();
        }else if (position == 3){
            //The third floor - floor 3 fragment
            return new FloorThreeFragment();
        }else if (position == 4){
            //The fourth floor - floor 4 fragment
            return new FloorFourFragment();
        }else if (position == 5){
            //The fifth floor - floor 5 fragment
            return new FloorFiveFragment();
        } else {
            //The sixth floor - floor 6 fragment
            return new FloorSixFragment();
        }
    }

    //Seven fragments, one for each floor plus the Cret building
    @Override
    public int getCount() {
        return 7;
    }

    //Points each position to the appropriate floor name string with the "main floor" (2nd) at 0, then the "old library" (the cret) at 1, then 1st-6th
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return myContext.getString(R.string.floor_2);
        }
        else if (position == 1){
            return myContext.getString(R.string.floor_cret);
        }else if (position == 2){
            return myContext.getString(R.string.floor_1);
        }else if (position == 3){
            return myContext.getString(R.string.floor_3);
        }else if (position == 4){
            return myContext.getString(R.string.floor_4);
        }else if (position == 5){
            return myContext.getString(R.string.floor_5);
        } else {
            return myContext.getString(R.string.floor_6);
        }
    }


}
