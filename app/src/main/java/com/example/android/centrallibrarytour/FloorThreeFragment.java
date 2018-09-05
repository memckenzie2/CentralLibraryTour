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


public class FloorThreeFragment extends Fragment {

    public FloorThreeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Create list of locations for Cret Building
        final ArrayList<LocationData> locs = new ArrayList<LocationData>();
        locs.add(new LocationData("6th Floor Materials", "The 6th Floor of the \"New\" Library is the Quiet Floor. It host the Fiction Collection, including book and audiobooks. This collection contains general fiction, and dedicated collections such as Mystery, Fantasy/Sci-Fi, and Urban Fiction. The East Wing also has a city observation deck and IndyPL's Indianapolis Special Collection Room containing a collection of unique archival items of local or global significance.", null));
        locs.add(new LocationData("Nina Mason Pulliam Indianapolis Special Collections Room", "The Nina Mason Pulliam Indianapolis Special Collections Room houses collections of archival materials of local or global significance. These include adult and children's materials by local authors, photographs, scrapbooks, typescripts, manuscripts, autographed editions, letters, newspapers, magazines, and realia. This collection has items from famous authors ranging from hometown heros such as Kurt Vonnegut to global powerhouses such as Shakespeare.", null));

        //Create a {@link LocationArrayAdapter} with a list of {@link LocationData}s
        LocationArrayAdapter adapter = new LocationArrayAdapter(getActivity(), locs);

        //Find the ListView object from location_list.xml layout file
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        //Point the listview to the LocationArrayAdapter we created above so it displays our list of locations
        listView.setAdapter(adapter);

        return rootView;
    }
}
