package com.example.aztech_school_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class myclasses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myclasses);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void goto_classes(View View){
        Intent mass = new Intent(this,content_of_courses.class);
        startActivity(mass);
    }
    public void goto_the_menu(View View){
        Intent mass = new Intent(this,themenu.class);
        startActivity(mass);
    }
}
