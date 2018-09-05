package com.example.android.centrallibrarytour;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FloorOneFragment extends Fragment {

    public FloorOneFragment() {
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
        locs.add(new LocationData("1st Floor Materials", "The 1st Floor of the \"New\" Library contains the Computer Lab, Makerspace (open only during program hours, see event calendar), a 24/7 Return Box for library materials, Offices for Indy Reads, and Lost and Found. It also provides access to the building via the 9th Street Entrance (Handicap Accessible).", null));
        locs.add(new LocationData("Computer Lab", "The Computer Lab has 36 public computers and designated staff to help answer questions about basic computer task. Common tasks that Computer Lab staff assist with are answering questions about navigating the internet, e-mail, Microsoft Office products, and the library's digital collection./nThere is also a 12-Seat Training Lab offering classes on computer skills ranging from complete beginner to advanced. The Training Lab also host the Job Center four times a week to help job seekers with common tasks such as writing resumes and filling in online applications.", null));

        //Create a {@link LocationArrayAdapter} with a list of {@link LocationData}s
        LocationArrayAdapter adapter = new LocationArrayAdapter(getActivity(), locs);

        //Find the ListView object from location_list.xml layout file
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        //Point the listview to the LocationArrayAdapter we created above so it displays our list of locations
        listView.setAdapter(adapter);

        return rootView;
    }
}
