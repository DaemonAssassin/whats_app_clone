package com.gmail.mateendev3.listviewconcepts;

public class SingleViewListView {
    private final int mProfileImage;
    private final String mName;
    private final String mMessage;
    private final String mTime;
    private int mMutedPinedImage = -1;

    public SingleViewListView(int profileImage, String name, String message, String time, int mutedPinedImage) {
        this.mProfileImage = profileImage;
        this.mName = name;
        this.mMessage = message;
        this.mTime = time;
        this.mMutedPinedImage = mutedPinedImage;
    }

    public SingleViewListView(int profileImage, String name, String message, String time) {
        this.mProfileImage = profileImage;
        this.mName = name;
        this.mMessage = message;
        this.mTime = time;
    }

    public int getProfileImage () {
        return mProfileImage;
    }
    public String getName () {
        return mName;
    }
    public String getMessage () {
        return mMessage;
    }
    public String getTime () {
        return mTime;
    }
    public int getMutedPinedImage () {
        return mMutedPinedImage;
    }

    public boolean hasMutedPinnedImage () {
        return mMutedPinedImage != -1;
    }
}
