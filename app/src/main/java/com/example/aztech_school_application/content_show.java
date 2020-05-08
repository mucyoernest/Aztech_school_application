package com.example.aztech_school_application;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.PopupWindow;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class content_show extends AppCompatActivity {
    Button click;
    VideoView videoView;
    MediaController mediac;

    Button showPopupBtn, closePopupBtn;
    PopupWindow popupWindow;
    LinearLayout linearLayout1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_show);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        click = (Button) findViewById(R.id.button2);
        videoView = (VideoView) findViewById(R.id.videoView);
        mediac = new MediaController(this);


        showPopupBtn = (Button) findViewById(R.id.submit);
        linearLayout1 = (LinearLayout) findViewById(R.id.linearLayout1);

        showPopupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) content_show.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.popup,null);

                closePopupBtn = (Button) customView.findViewById(R.id.closePopupBtn);

                //instantiate popup window
                popupWindow = new PopupWindow(customView, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                //display the popup window
                popupWindow.showAtLocation(linearLayout1, Gravity.CENTER, 0, 0);

                //close the popup window on button click
                closePopupBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }
                });

            }
        });



    }

    public void videplay(View v)
    {
        String videopath = "android.resource://com.example.aztech_school_application/" +R.raw.video1;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediac);
        mediac.setAnchorView(videoView);
        videoView.start();
    }

    public void goto_classes(View View){
        Intent mass = new Intent(this,content_of_courses.class);
        startActivity(mass);
    }
}
