package com.example.android.centrallibrarytour;

public class LocationData {
    private String locName;
    private int locPictureId = -1;
    private String locDescription;
    private String locLink;


    public LocationData(String locationName, String locationDescription, String locationLink){
        setLocName(locationName);
        setLocDescription(locationDescription);
        setLocLink(locationLink);
    }

    public LocationData(String locationName, String locationDescription, String locationLink, int locationPictureID){
        setLocName(locationName);
        setLocDescription(locationDescription);
        setLocLink(locationLink);
        setLocPictureId(locationPictureID);
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;

    }

    public int getLocPictureId() {
        return locPictureId;
    }

    public void setLocPictureId(int locPictureID) {
        this.locPictureId = locPictureID;
    }

    public String getLocDescription() {
        return locDescription;
    }

    public void setLocDescription(String locDescription) {
        this.locDescription = locDescription;
    }

    public String getLocLink() {
        return locLink;
    }

    public void setLocLink(String locLink) {
        this.locLink = locLink;
    }
}
