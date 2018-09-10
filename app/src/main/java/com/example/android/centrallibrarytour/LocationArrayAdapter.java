package com.example.android.centrallibrarytour;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationArrayAdapter extends ArrayAdapter<LocationData>{
    public LocationArrayAdapter(Context context, ArrayList<LocationData> loc) {
        super(context, 0, loc);
    }

    @Override
    public View getView(final int locationPosition, View convertableView, ViewGroup parentView) {
        View locView = convertableView;

        //Inflates a view if no view has been made or reuses current view if it has.
        //Check to see if view exists
        if (locView == null) {
            //inflates view
            locView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_list_item, parentView, false);
        }

        // Get the LocationData object for the given position in the menu list
        final LocationData currentLocItem = getItem(locationPosition);

        TextView locName = locView.findViewById(R.id.location_name);
        locName.setText(currentLocItem.getLocName());

        TextView locDescription = locView.findViewById(R.id.location_description);
        locDescription.setText(currentLocItem.getLocDescription());

        final ImageView locImage = locView.findViewById(R.id.location_image);
        if(currentLocItem.getLocPictureId() == -1){
            locImage.setVisibility(View.GONE);
        }else{
            locImage.setImageResource(currentLocItem.getLocPictureId());
            locImage.setVisibility(View.VISIBLE);
        }

        Button locMapLink = locView.findViewById(R.id.view_in_map);
        if(currentLocItem.getLocLink() == null){
            locMapLink.setVisibility(View.GONE);
        }else{
            locMapLink.setVisibility(View.VISIBLE);
        }

        locMapLink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Creates an Intent that will load a map of San Francisco
                Uri gmmIntentUri = Uri.parse(currentLocItem.getLocLink());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                locImage.getContext().startActivity(mapIntent);
            }

        });

        return locView;
    }
}