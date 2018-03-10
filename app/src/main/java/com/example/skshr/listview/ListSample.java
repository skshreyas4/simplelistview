package com.example.skshr.listview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by skshr on 26-01-2018.
 */

public class ListSample extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        ListView lv=(ListView) findViewById(R.id.list_view1);
        String names[] = {"ram","jam","dom","dos","desmond","dunkrik"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(ListSample.this,android.R.layout.simple_list_item_1,names);
        lv.setAdapter(adapter);


    }
}

