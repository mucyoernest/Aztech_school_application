package com.example.aztech_school_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class courses extends AppCompatActivity {
    TextView status;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    View view1;
    View view2;
    View view3;
    View view4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        status = (TextView)findViewById(R.id.status);
        text1 = (TextView)findViewById(R.id.text1);
        text2= (TextView)findViewById(R.id.text2);
        text3= (TextView)findViewById(R.id.text3);
        text4= (TextView)findViewById(R.id.text4);


        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        image3 = (ImageView) findViewById(R.id.image3);
        image4 = (ImageView) findViewById(R.id.image4);

        view1 =(View)findViewById(R.id.view1);
        view2 =(View)findViewById(R.id.view2);
        view3 =(View)findViewById(R.id.view3);
        view4 =(View)findViewById(R.id.view4);




    }
    public void goto_classes(View View){
        Intent mass = new Intent(this,myclasses.class);
        startActivity(mass);
    }
    public void CS(View View){
        status.setText("computer Science");
        image1.setImageResource(R.drawable.android);
        image2.setImageResource(R.drawable.cloud);
        image3.setImageResource(R.drawable.html);
        image4.setImageResource(R.drawable.ai);

        text1.setText("Mobile Development");
        text2.setText("Cloud computing");
        text3.setText("Computer Networking");
        text4.setText(" Artificial Intelligence");

//        view1.setBackgroundColor(R.color.tickercolor);

    }

    public void IBT(View View){
        status.setText("International Business");
        image1.setImageResource(R.drawable.accounting);
        image2.setImageResource(R.drawable.business);
        image3.setImageResource(R.drawable.marketting);
        image4.setImageResource(R.drawable.venture);

        text1.setText("Business Ops");
        text2.setText("People management");
        text3.setText("Digital marketing");
        text4.setText(" Intro to Entrepreneurship");

    }
    public void GC(View View){
        status.setText("computer Science");
        image1.setImageResource(R.drawable.android);
        image2.setImageResource(R.drawable.cloud);
        image3.setImageResource(R.drawable.html);
        image4.setImageResource(R.drawable.ai);

        text1.setText("Mobile Development");
        text2.setText("Cloud computing");
        text3.setText("Computer Networking");
        text4.setText(" Artificial Intelligence");
    }
    public void EP(View View){
        status.setText("computer Science");
        image1.setImageResource(R.drawable.accounting);
        image2.setImageResource(R.drawable.business);
        image3.setImageResource(R.drawable.marketting);
        image4.setImageResource(R.drawable.venture);

        text1.setText("Business Ops");
        text2.setText("People management");
        text3.setText("Digital marketing");
        text4.setText(" Intro to Entrepreneurship");

    }

}
