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

public class FloorThreeFragment extends Fragment {

    public FloorThreeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Create list of instances of LocationData for locations in the 3rd floor
        final ArrayList<LocationData> locs = new ArrayList<LocationData>();
        locs.add(new LocationData(getString(R.string.floor_3_materials), getString(R.string.floor_3_materials_blurb), null,R.drawable.background_photo_in_the_stacks));
        locs.add(new LocationData(getString(R.string.teen_area), getString(R.string.teen_area_blurb), null));
        locs.add(new LocationData(getString(R.string.assistive), getString(R.string.assistive_blurb), null, R.drawable.img_0540_2014_assistivetech));

        //Create a {@link LocationArrayAdapter} with a list of {@link LocationData}s
        LocationArrayAdapter adapter = new LocationArrayAdapter(getActivity(), locs);

        //Find the ListView object from location_list.xml layout file
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        //Point the listview to the LocationArrayAdapter we created above so it displays our list of locations
        listView.setAdapter(adapter);

        return rootView;
    }
}
