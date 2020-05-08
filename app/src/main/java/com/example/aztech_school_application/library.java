package com.example.aztech_school_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        Toolbar toolbar = findViewById(R.id.toolbar);

    }

    public void open_librairy(View View){
        Intent mass = new Intent(this,second_library.class);
        startActivity(mass);
    }
}
