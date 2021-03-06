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

/*CODE SOURCE AND PERMISSIONS
 * The implementation for the ListView, MenuAdapter, ArrayAdapter, Fragments, and tabLayout were adapted from examples from the Miwok app in the Udacity Nanodegree.
 * The source code for that project can be found here: https://github.com/udacity/ud839_Miwok/tree/lesson-one/app/src/main/java/com/example/android/miwok
 * AND from the AudioBook App (created by this app's author Marianne McKenzie) for the Udacity nanodegree whose source code can be found here: https://github.com/memckenzie2/AudiobookApp
 */

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

        //Displays the LocationData's location name to the location_name TextView in location_list_item.xml
        TextView locName = locView.findViewById(R.id.location_name);
        locName.setText(currentLocItem.getLocName());

        //Displays the LocationData's location description to the location_description TextView in location_list_item.xml
        TextView locDescription = locView.findViewById(R.id.location_description);
        locDescription.setText(currentLocItem.getLocDescription());

        //Displays the LocationData's location image in location_list_item.xml if it has a locPictureID defined. If not, sets the image's visibility to GONE.
        final ImageView locImage = locView.findViewById(R.id.location_image);
        if(currentLocItem.getLocPictureId() == -1){
            locImage.setVisibility(View.GONE);
        }else{
            locImage.setImageResource(currentLocItem.getLocPictureId());
            locImage.setVisibility(View.VISIBLE);
        }

        //Displays the "VIEW ON MAP" button in location_list_item.xml if the LocationData's instance has a locLink defined. If not, sets the button's visibility to GONE
        Button locMapLink = locView.findViewById(R.id.view_in_map);
        if(currentLocItem.getLocLink() == null){
            locMapLink.setVisibility(View.GONE);
        }else{
            locMapLink.setVisibility(View.VISIBLE);
        }

        //Sets an onClickListener for the "VIEW ON MAP" button.
        locMapLink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Creates an Intent for a map app and passes it the geographic location from the LocationData instance
                Uri gmmIntentUri = Uri.parse(currentLocItem.getLocLink());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                //Launches user's default map app
                locImage.getContext().startActivity(mapIntent);
            }

        });

        return locView;
    }
}