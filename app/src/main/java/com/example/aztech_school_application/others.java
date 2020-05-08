package com.example.aztech_school_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class others extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);
    }

    public void registrar(View View){
        Intent mass = new Intent(this,Registrar.class);
        startActivity(mass);
    }

    public void svp(View View){
        Intent mass = new Intent(this,svp1.class);
        startActivity(mass);
    }


}
