package com.example.aztech_school_application;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static int TIME_OUT = 6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View myLayout = findViewById(R.id.start);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, LoginPage.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);
    }

    public void change_page(View View)
    {
        Intent mass = new Intent(this,LoginPage.class);
        startActivity(mass);
    }
}