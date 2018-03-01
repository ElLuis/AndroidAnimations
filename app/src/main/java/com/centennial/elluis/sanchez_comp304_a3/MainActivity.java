package com.centennial.elluis.sanchez_comp304_a3;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> taskItems = new ArrayList<>();
        taskItems.add("Task 1");
        taskItems.add("Task 2");
        taskItems.add("Task 3");
        //populating the listview items
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,taskItems);

        //Binding listview
        ListView listView = findViewById(android.R.id.list);
        listView.setAdapter(adapter);
    }
}
