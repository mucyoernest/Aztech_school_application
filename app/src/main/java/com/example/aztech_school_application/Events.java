package com.example.aztech_school_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Events extends AppCompatActivity {
    String [] EVENT_NAMES = {"EVENT A", "EVENT B","EVENT C","EVENT A","EVENT A","EVENT A", "EVENT B","EVENT C","EVENT A","EVENT A"};
    String [] LOCATION = {"Kacyiru","Kacyiru","Kacyiru","Kacyiru","Kacyiru","Kacyiru","Kacyiru","Kacyiru","Kacyiru","Kacyiru"};
    String [] DATES = {"08/08/2020","08/08/2020","08/08/2020","08/08/2020","08/08/2020","08/08/2020","08/08/2020","08/08/2020","08/08/2020","08/08/2020"};
    String [] TIME = {"10 PM","10 PM","10 PM","10 PM","10 PM","10 PM","10 PM","10 PM","10 PM","10 PM","10 PM"};
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ListView listView = (ListView)findViewById(R.id.eventlist);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        button = (Button)findViewById(R.id.confirm);

    }


    class CustomAdapter  extends BaseAdapter{

        @Override
        public int getCount() {
            return EVENT_NAMES.length;
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
            convertView = getLayoutInflater().inflate(R.layout.customlistview,null);
            TextView event_name = (TextView) convertView.findViewById(R.id.event_name);
            TextView event_date = (TextView) convertView.findViewById(R.id.Date);
            TextView event_Location = (TextView) convertView.findViewById(R.id.Location);
            TextView event_time = (TextView) convertView.findViewById(R.id.time);



            event_name.setText(EVENT_NAMES[position]);
            event_date.setText(DATES[position]);
            event_Location.setText(LOCATION[position]);
            event_time.setText(TIME[position]);

            return convertView;
        }


    }
    public void added_to_guess_list(View View){
        Intent mass = new Intent(this,addedtolist.class);
        startActivity(mass);
        View.setBackgroundResource(R.color.colorPrimary);

        View.setBackgroundResource(R.color.tickercolor);


    }
}




