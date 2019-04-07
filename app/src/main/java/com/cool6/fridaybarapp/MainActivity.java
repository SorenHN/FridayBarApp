package com.cool6.fridaybarapp;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BarList list = BarList.getInstance();
        list.add(new Bar("Katrines Basement", "Finlandsgade 40"));
        list.add(new Bar("Datbar", "Finlandsgade 10"));
        list.add(new Bar("Umbi", "Uniparken"));
    }

    public void goToBarList(View view)
    {
        Intent intent = new Intent(this, BarListActivity.class);
        this.startActivity(intent);
    }
}
