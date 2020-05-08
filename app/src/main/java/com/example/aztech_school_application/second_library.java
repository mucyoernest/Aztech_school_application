package com.example.aztech_school_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class second_library extends AppCompatActivity {
    String [] TITLES = {"BOOK A", "BOOK B","BOOK C","BOOK A","BOOK A","BOOK A", "BOOK B","BOOK C","BOOK A","BOOK A"};
    String [] AUTHORS = {"K. SORO","K. SORO","K. SORO","K. SORO","K. SORO","K. SORO","K. SORO","K. SORO","K. SORO","K. SORO"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_library);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ListView listView = (ListView)findViewById(R.id.books);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

    }


    class CustomAdapter  extends BaseAdapter{

        @Override
        public int getCount() {
            return TITLES.length;
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
            convertView = getLayoutInflater().inflate(R.layout.library_layout,null);
            TextView book_title = (TextView) convertView.findViewById(R.id.book_title);
            TextView author_name = (TextView) convertView.findViewById(R.id.author_name);



            book_title.setText(TITLES[position]);
            author_name.setText(AUTHORS[position]);
            return convertView;
        }


    }
    public void take_to_book(View View){
        Intent mass = new Intent(this,thebook.class);
        startActivity(mass);

    }
}




