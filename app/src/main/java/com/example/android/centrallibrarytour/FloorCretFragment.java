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
        locs.add(new LocationData("Cret Materials", "The Cret hosts several collection including New Materials in the central Plaze, World Literature and Materials in the central stacks, Biography and Archival Reference in the East wing, and the Center for Black Literature and Culture in the West Wing.\n", null));
        locs.add(new LocationData("Center for Black Literature and Culture", "The west wing of the Cret is dedicated to the Center for Black Literature & Culture (CBLC). This collection and space is dedicated to celebrating the vibrant and resilient heritage and triumphs of those born of African roots. It has a particular focus on black icons who have Indiana roots but also highlights the works of notable figures who have had a national or global impact .  This space has both permanent and rotating displays appropriate for all age levels, a collection of materials maintained by Special Collections Librarian Nichelle Hayes, and hosts a variety of community events and workshops for artists and authors.", null));
        locs.add(new LocationData("The Cret Architecture", "The original Central Library building, known as \"The Cret\" for its designer Paul Cret, was opened in October 1917. It was built on land donated by noted Indiana Poet James Whitcomb Riley. The Cret has a Greek Doric style with an exterior constructed from Indiana limestone with carved stone cornices and a base of Vermont marble. Two bronze gates at the main entrance were purchased with pennies donated by Indianapolis school children in1916 and continued refurbishment efforts have been funded in part by penny donations from local school children through 2017.\n" +
                "\n" +
                "Internal design features include materials such as Indiana limestone, walnut and white oak and a reading room with a ceiling painted in the Pompeian style by C. C. Zantzinger and telling the history of Indiana." +
                "See if you can spot your favorite author among the many carved into the exterion walls of the building.", null));

        //Create a {@link LocationArrayAdapter} with a list of {@link LocationData}s
        LocationArrayAdapter adapter = new LocationArrayAdapter(getActivity(), locs);

        //Find the ListView object from location_list.xml layout file
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        //Point the listview to the LocationArrayAdapter we created above so it displays our list of locations
        listView.setAdapter(adapter);

        return rootView;
    }

}
