package com.example.android.centrallibrarytour;

/*A custom class for storing data about a geographic location including name, geographic coordinates, an image, and a description. */

public class LocationData {
    //Defines the values associated with an location: Name, A resource id for the picture stored as an int,
    // description for the location, and geo coordinates to link the location to a map
    private String locName;
    //Resource ID is initialized to -1 (a value that would not be an ID) to indicate that no image is associated with a Location
    private int locPictureId = -1;
    private String locDescription;
    private String locLink;


    /**
     * Create a new Location Data object to display the text for the various value related to a physical location
     *
     * @param locationName  The nameof the location in string format
     * @param locationDescription The description of the location in string format
     * @param locationLink The geographic coordinates for the location to be used with a map app
     */
    public LocationData(String locationName, String locationDescription, String locationLink){
        setLocName(locationName);
        setLocDescription(locationDescription);
        setLocLink(locationLink);
    }

    /**
     * Create a new Location Data object to display the text for the various value related to a physical location
     *
     * @param locationName  The nameof the location in string format
     * @param locationDescription The description of the location in string format
     * @param locationLink The geographic coordinates for the location to be used with a map app
     * @param locationPictureID The resource ID for an image file that displays the location
     */
    public LocationData(String locationName, String locationDescription, String locationLink, int locationPictureID){
        setLocName(locationName);
        setLocDescription(locationDescription);
        setLocLink(locationLink);
        setLocPictureId(locationPictureID);
    }

    //Retrieves locName - locName the location name in string format
    public String getLocName() {
        return locName;
    }

    //Assigns a value to locName- locName the location name in string format
    public void setLocName(String locName) {
        this.locName = locName;

    }

    //Retrieves locPictureID - the location's image resource ID in integer format
    public int getLocPictureId() {
        return locPictureId;
    }

    //Assigns a value to locPictureID - the location's image resource ID in integer format
    public void setLocPictureId(int locPictureID) {
        this.locPictureId = locPictureID;
    }

    //Retrieves locDescription - the location description in string format
    public String getLocDescription() {
        return locDescription;
    }

    //Assigns a value to locDescription - the location description in string format
    public void setLocDescription(String locDescription) {
        this.locDescription = locDescription;
    }

    //Retrieves locLink - the locations geographic coordinates in string format
    public String getLocLink() {
        return locLink;
    }

    //Assigns a value to locLink - the locations geographic coordinates in string format
    public void setLocLink(String locLink) {
        this.locLink = locLink;
    }
}
