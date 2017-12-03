package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView displayWeatherDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Complete (2) Display the weather forecast that was passed from MainActivity

        Intent intent = getIntent();
        String weatherData = "";
        if(intent != null) {
            if(intent.hasExtra(Intent.EXTRA_TEXT)) {
                weatherData = intent.getStringExtra(Intent.EXTRA_TEXT);
            }
        }

        displayWeatherDetails = (TextView) findViewById(R.id.tv_weather_details);
        displayWeatherDetails.setText(weatherData);
    }
}