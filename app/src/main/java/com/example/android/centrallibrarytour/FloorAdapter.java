package com.example.android.centrallibrarytour;

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
    public FloorAdapter(FragmentManager fm) {
        super(fm);
    }

    //Points each position to the appropriate floor starting with the "cret" at 0, 1st floor at 1, etc.
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new FloorCretFragment();
        }
        else if (position == 1){
            return new FloorOneFragment();
        }else if (position == 2){
            return new FloorTwoFragment();
        }else if (position == 3){
            return new FloorThreeFragment();
        }else if (position == 4){
            return new FloorFourFragment();
        }else if (position == 5){
            return new FloorFiveFragment();
        } else {
            return new FloorSixFragment();
        }
    }

    //Seven fragments, one for each floor plus the Cret building
    @Override
    public int getCount() {
        return 7;
    }
}
