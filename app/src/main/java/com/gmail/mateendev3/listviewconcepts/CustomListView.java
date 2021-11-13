package com.gmail.mateendev3.listviewconcepts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CustomListView extends AppCompatActivity {
    List<SingleViewListView> list;
    ListView customListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        customListView = findViewById(R.id.custom_listView);
        initList();

        ListViewAdapter adapter = new ListViewAdapter(this, list);
        customListView.setAdapter(adapter);

        customListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SingleViewListView singleViewListView = (SingleViewListView) parent.getItemAtPosition(position);
                Toast.makeText(CustomListView.this, "Hello " + singleViewListView.getName() , Toast.LENGTH_LONG).show();
            }
        });


    }

    private void initList() {
        list = new ArrayList<>();
        list.add(new SingleViewListView(R.drawable.mateen, "Mateen Mehmood", "Kia ho raha hai aaj kal?", "11:00 AM", R.drawable.ic_pin));
        list.add(new SingleViewListView(R.drawable.jasia, "Jasia Mehmood", "Zabardast aap sunao", "Yesterday", R.drawable.ic_volume_mute));
        list.add(new SingleViewListView(R.drawable.zain, "Zain Raza", "Oo pai!!!", "09:00 PM"));
        list.add(new SingleViewListView(R.drawable.ayesha, "Ayesha Asif", "Bhai kithe ponchay?", "Yesterday"));
        list.add(new SingleViewListView(R.drawable.waheed, "Waheed", "Whats up", "10:00 AM", R.drawable.ic_volume_mute));
        list.add(new SingleViewListView(R.drawable.friends, "SHM", "Bhai Kab Milna?", "10:00 AM", R.drawable.ic_volume_mute));
    }
}