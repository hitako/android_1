package com.example.android_1_lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private AppCompatButton weatherActivity;
    private EditText cityString;
    public static String FROM_MAIN_ACTIVITY = "FROM_MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        weatherActivity.setOnClickListener(v -> onSaveAndFinishClicked());
    }

    private void initViews() {
        weatherActivity = findViewById(R.id.weather_activity);
        cityString = findViewById(R.id.city_string);
    }

    private void onSaveAndFinishClicked() {
        LocalParcel parcel = new LocalParcel();
        parcel.setCity(cityString.getText().toString());

        Intent dataToWeatherActivity = new Intent(this, MainActivity.class);
        dataToWeatherActivity.putExtra(FROM_MAIN_ACTIVITY, parcel);
        setResult(Activity.RESULT_OK, dataToWeatherActivity);
        finish();
    }
}