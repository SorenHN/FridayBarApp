package com.cool6.fridaybarapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Bar
{
    String name = "";
    String address = "";

    Bar(String newName, String addr)
    {
        name = newName;
        address = addr;
    }
}
