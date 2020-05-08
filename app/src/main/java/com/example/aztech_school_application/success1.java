package com.example.aztech_school_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class success1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public void menu(View View)
    {
        Intent mass = new Intent(this,themenu.class);
        startActivity(mass);
    }
}
