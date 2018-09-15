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
public class FloorCretFragment extends Fragment {

    public FloorCretFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Create list of locations for Cret Building
        final ArrayList<LocationData> locs = new ArrayList<LocationData>();
        locs.add(new LocationData(getString(R.string.floor_cret_materials),getString(R.string.floor_cret_materials_blurb) , "geo:39.7782486,-86.1567497,3a,75y,309.53h,88.11t", R.drawable.east_reading_room_2009_kisling));
        locs.add(new LocationData(getString(R.string.cblc), getString(R.string.cblc_blurb), null, R.drawable.cblc_website_photos_04));
        locs.add(new LocationData(getString(R.string.architecture), getString(R.string.architecture_blurb), null, R.drawable.p9140521));

        //Create a {@link LocationArrayAdapter} with a list of {@link LocationData}s
        LocationArrayAdapter adapter = new LocationArrayAdapter(getActivity(), locs);

        //Find the ListView object from location_list.xml layout file
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        //Point the listview to the LocationArrayAdapter we created above so it displays our list of locations
        listView.setAdapter(adapter);

        return rootView;
    }

}
