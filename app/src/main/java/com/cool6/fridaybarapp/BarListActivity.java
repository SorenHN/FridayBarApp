package com.cool6.fridaybarapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BarListActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_list);

        BarList list = BarList.getInstance();
        Bar bar = list.get(0);

        TextView nameView = findViewById(R.id.nameView);
        nameView.setText(bar.name);
        TextView address = findViewById(R.id.addressView);
        address.setText(bar.address);
        TextView distance = findViewById(R.id.distanceView);
        distance.setText("420 m");

    }
}
