package com.example.aztech_school_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class pay1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void cardpay(View View)
    {
        Intent mass = new Intent(this,card_payment.class);
        startActivity(mass);
    }

    public void bankslip(View View)
    {
        Intent mass = new Intent(this,camera.class);
        startActivity(mass);
    }






}