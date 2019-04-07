package com.cool6.fridaybarapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class BarListActivity extends Activity
{
    private BarList list;
    private int barCounter = 0;
    private int toastCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_list);

        list = BarList.getInstance();
        updateBarView();
    }

    public void showNextBar(View view)
    {
        if(barCounter < list.size() - 1)
        {
            barCounter++;
            updateBarView();
        }
        else
        {
            if(toastCounter < 3)
            {
                Toast.makeText(this, "Concratualtions, you made it!", Toast.LENGTH_LONG).show();
                toastCounter++;
            }
            else
            {
                Toast.makeText(this, "Go home, your drunk!", Toast.LENGTH_LONG).show();
            }
        }
    }

    private void updateBarView()
    {
        Bar bar = list.get(barCounter);
        TextView nameView = findViewById(R.id.nameView);
        nameView.setText(bar.name);
        TextView address = findViewById(R.id.addressView);
        address.setText(bar.address);
        TextView distance = findViewById(R.id.distanceView);
        distance.setText("420 m");
    }
}
