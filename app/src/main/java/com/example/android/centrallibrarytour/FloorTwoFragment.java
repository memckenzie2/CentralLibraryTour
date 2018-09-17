package com.example.android.centrallibrarytour;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/* PERMISSIONS AND COPYRIGHT FOR IMAGES AND TEXT
 * Images and text descriptions for Central Library are used with limited permission for academic use from the
 * Indianapolis Public Library - this permission is granted only to the employee Marianne McKenzie.
 * Images and text may not be reproduced by any other individual without prior written permission from the
 * Indianapolis Public Library: http://www.indypl.org/about/contact/ */

public class FloorTwoFragment extends Fragment {


    public FloorTwoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Create list of instances of LocationData for locations in the 2nd floor (main floor)
        final ArrayList<LocationData> locs = new ArrayList<LocationData>();
        locs.add(new LocationData(getString(R.string.welcome), getString(R.string.welcome_blurb), "geo:39.777957,-86.1589627,17z", R.drawable.dscf0083));
        locs.add(new LocationData(getString(R.string.atrium), getString(R.string.atrium_blurb), null, R.drawable.central_photos_131_2013));
        locs.add(new LocationData(getString(R.string.learning_curve), getString(R.string.learning_curve_blurb), null, R.drawable.srp_curve_001));
        locs.add(new LocationData(getString(R.string.meeting_room), getString(R.string.meeting_room_blurb), null, R.drawable.central_photos_architect_photos_008));
        locs.add(new LocationData(getString(R.string.auditorium), getString(R.string.welcome_blurb), null, R.drawable.central_photos_architect_photos_005));
        locs.add(new LocationData(getString(R.string.atrium_art), getString(R.string.atrium_art_blurb), null, R.drawable.indianapolis_central_library3_central_pics));


        //Create a {@link LocationArrayAdapter} with a list of {@link LocationData}s
        LocationArrayAdapter adapter = new LocationArrayAdapter(getActivity(), locs);

        //Find the ListView object from location_list.xml layout file
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        //Point the listview to the LocationArrayAdapter we created above so it displays our list of locations
        listView.setAdapter(adapter);

        return rootView;
    }
}
