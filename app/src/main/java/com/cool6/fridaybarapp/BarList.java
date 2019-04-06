package com.cool6.fridaybarapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BarList extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_list);

        Intent intent = getIntent();
        Bar bar = (Bar) intent.getParcelableExtra("bar");

        TextView nameView = findViewById(R.id.nameView);
        nameView.setText(bar.name);

        TextView address = findViewById(R.id.addressView);
        address.setText("Location");

        //TextView textView = findViewById(R.id.textView);
        //textView.setText(barName);
    }
}
