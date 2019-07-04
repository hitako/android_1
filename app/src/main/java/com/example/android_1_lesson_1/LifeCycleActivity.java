package com.example.android_1_lesson_1;

import android.content.ServiceConnection;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class LifeCycleActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life_cycle);
        showMessage(this, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showMessage(this, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showMessage(this, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showMessage(this, "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showMessage(this, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showMessage(this, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showMessage(this, "onRestart");
    }
}
