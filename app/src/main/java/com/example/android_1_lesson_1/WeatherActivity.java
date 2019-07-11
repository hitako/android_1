package com.example.android_1_lesson_1;

import android.os.Bundle;

import androidx.annotation.Nullable;

public class WeatherActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_SECOND_A = 100;
    private TextView city_weather;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        city_weather = findViewById(R.id.city_weather);
    }

    @Override protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE_SECOND_A) {
            if (data != null && data.getExtras() != null) {
                LocalParcel receivedData = (LocalParcel) data.getExtras().get(FROM_MAIN_ACTIVITY);

                if (receivedData != null) {
                    city_weather.setText(receivedData.getCity() + ": 26&#8451;");
                }
            }
        }
    }
}
