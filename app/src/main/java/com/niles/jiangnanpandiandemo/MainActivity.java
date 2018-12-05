package com.niles.jiangnanpandiandemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.niles.pandian.activity.SplashActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View view) {
        Intent intent = new Intent(this, SplashActivity.class);
        intent.putExtra("mx_sso_token", BuildConfig.MX_SSO_TOKEN);
        startActivity(intent);
    }
}
