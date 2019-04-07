package com.cool6.fridaybarapp;

import android.app.Activity;
import android.os.Bundle;

import java.net.HttpURLConnection;

import okhttp3.OkHttpClient;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void createBinding(){
        OkHttpClient client = new OkHttpClient();
        String URL = "ttps://api.sandbox.mobilepay.dk/bindings-restapi/api/v1/bindings";


    }

    public void goToBarList(View view)
    {
        Intent intent = new Intent(this, BarListActivity.class);
        this.startActivity(intent);
    }
}
