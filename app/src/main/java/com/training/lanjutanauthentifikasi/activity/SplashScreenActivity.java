package com.training.lanjutanauthentifikasi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.training.lanjutanauthentifikasi.R;
import com.training.lanjutanauthentifikasi.helper.MyFuction;

public class SplashScreenActivity extends MyFuction {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));
                finish();
            }
        },4000);

    }
}
