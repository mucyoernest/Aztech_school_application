package com.example.aztech_school_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class content_of_courses extends AppCompatActivity {

    String [] MAIN_TITLE = {"Welcome ", "Meet intructors","Introduction","What is android","Fragments","Activities", "NFS","QR code scanners","Type identifications","End of the course"};
    String [] SUB_TITLE = {"Supplemental material","Supplemental material","Supplemental material","Supplemental material","Supplemental material","Supplemental material","Supplemental material","Supplemental material","Supplemental material","Supplemental material"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_of_courses);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ListView listView = (ListView)findViewById(R.id.contentlist);
        content_of_courses.CustomAdapter customAdapter = new content_of_courses.CustomAdapter();
        listView.setAdapter(customAdapter);

    }


    class CustomAdapter  extends BaseAdapter {

        @Override
        public int getCount() {
            return MAIN_TITLE.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.contentlistview,null);
            TextView main_title = (TextView) convertView.findViewById(R.id.main_tittle);
            TextView second_title = (TextView) convertView.findViewById(R.id.second_title);



            main_title.setText(MAIN_TITLE[position]);
            second_title.setText(SUB_TITLE[position]);

            return convertView;
        }


    }
    public void goto_the_menu(View View){
        Intent mass = new Intent(this,content_show.class);
        startActivity(mass);
    }

}




