package com.cool6.fridaybarapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToBarList(View view)
    {
        Bar bar = new Bar("Datbar"/*, "Finlandsgade 22"*/);

        Intent intent = new Intent(this, BarList.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        intent.putExtra("bar", (Parcelable)bar);
        this.startActivity(intent);
    }
}
