package com.gmail.mateendev3.listviewconcepts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initList();

        String[] list1 = getResources().getStringArray(R.array.countries_list);

        ListView listView = findViewById(R.id.root_listView);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>
                        (this,
                        android.R.layout.simple_list_item_1,
                        list1);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(
                        MainActivity.this,
                        "You selected " + item,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void initList() {
        list = new ArrayList<>();
        list.add("Afghanistan");
        list.add("Bahamas");
        list.add("Chile");
        list.add("Canada");
        list.add("Estonia");
        list.add("Havana");
        list.add("London");
        list.add("Turkey");
        list.add("Iran");
        list.add("Iraq");
        list.add("Saudi Arabia");
        list.add("Australia");
        list.add("South Africa");
        list.add("Pakistan");
    }
}