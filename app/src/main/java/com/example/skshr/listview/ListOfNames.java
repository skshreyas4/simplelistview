package com.example.skshr.listview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by skshr on 30-01-2018.
 */

public class ListOfNames extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listofnames);
        ListView id = (ListView)findViewById(R.id.listnames);
        String names []={"ram","sham","dom","som","mom"};
        ArrayAdapter<String >adapter=new ArrayAdapter<String>(ListOfNames.this,android.R.layout.simple_list_item_activated_1,names);
        id.setAdapter(adapter);
    }
}

