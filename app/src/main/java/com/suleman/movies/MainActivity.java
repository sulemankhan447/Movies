package com.suleman.movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
RecyclerView.Adapter adapter;
RecyclerView.LayoutManager layoutManager;
ArrayList<Contact> list=new ArrayList<Contact>();
    int []image_id = {R.drawable.bkb,R.drawable.golmaal,R.drawable.jbms,R.drawable.shaadi,R.drawable.snowden};
    String[] movie_name,movie_genre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movie_name = getResources().getStringArray(R.array.movie_name);
        movie_genre=getResources().getStringArray(R.array.movie_genre);
        int count=0;
        for(String name:movie_name)
        {
            Contact contact = new Contact(image_id[count],name,movie_genre[count]);
            count++;
            list.add(contact);
        }
        recyclerView=(RecyclerView) findViewById(R.id.recyler_view);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new ContactAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}
