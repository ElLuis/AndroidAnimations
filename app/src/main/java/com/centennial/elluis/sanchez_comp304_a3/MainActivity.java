package com.centennial.elluis.sanchez_comp304_a3;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,taskItems);

        DataItemAdapter adapter = new DataItemAdapter(this,taskItems);

        //Binding listview
        ListView listView = findViewById(android.R.id.list);
        listView.setAdapter(adapter);

        //On item click listener
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        //Get value at given position of parent and convert to string
                        String task = String.valueOf(parent.getItemAtPosition(position));

                        switch (task)
                        {
                            case "Task 1":
                                Intent intent = new Intent(MainActivity.this,PaintActivity.class);
                                startActivity(intent);
                                break;
                            case "Task 2":
                                    Intent intent1 = new Intent(MainActivity.this,FrameActivity.class);
                                    startActivity(intent1);

                                    break;
                            case "Task 3":
                                Intent intent2 = new Intent(MainActivity.this,TweenActivity.class);
                                startActivity(intent2);
                                break;
                        }

                    }
                }
        );

    }
}
