package com.example.android_1_lesson_1;

import android.os.Bundle;

import androidx.annotation.Nullable;

public class WeatherActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
    }
}
