package com.cool6.fridaybarapp;

import android.app.Application;
import com.cool6.fridaybarapp.Bar;

import java.util.ArrayList;

public class BarList
{
    private ArrayList<Bar> list = new ArrayList<Bar>();

    public void add(Bar bar)
    {
        list.add(bar);
    }

    public Bar get(int i)
    {
        return list.get(i);
    }

    public void set(int i, Bar bar)
    {
        list.set(i, bar);
    }

    private static final BarList barList = new BarList();
    public static BarList getInstance() {return barList;}
}
