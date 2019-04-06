package com.cool6.fridaybarapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Bar implements Parcelable
{
    String name = "";
    //String address = "";

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags)
    {
        out.writeString(name/* + "," + address*/);
    }

    public static final Parcelable.Creator<Bar> CREATOR = new Parcelable.Creator<Bar>()
    {
        public Bar createFromParcel(Parcel in)
        {
            return new Bar(in);
        }

        public Bar[] newArray(int size)
        {
            return new Bar[size];
        }
    };

    Bar(String newName/*, String addr*/)
    {
        name = newName;
        //address = addr;
    }

    private Bar(Parcel in)
    {
        name = in.readString();
    }

}
