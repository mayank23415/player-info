package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerVIew extends AppCompatActivity {
    private RecyclerView recyclerView;
    private int[] posters;
    private String[] genre, names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        buildData();

        recyclerView = findViewById(R.id.recyclerView);
        PlayerAdapter adapter = new PlayerAdapter(this, posters, names, genre);
        recyclerView.setAdapter(adapter);
    }

    private void buildData() {
        posters = new int[]{R.drawable.a,R.drawable.b, R.drawable.c, R.drawable.d,R.drawable.e,
                R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j};
        genre = new String[]{"Boxer", "Sprinter", "Basketeer", "Cricketer", "Badmintonist", "Cricketer", "Boxer", "Tennis Player", "Tennis Player", "Javelinier"};
        names = new String[]{"Mike Tyson", "Usain Bold", "Shaqeel O'Neil", "Glen Mcgrawth", "Lee Chong Wei", "Saching Tendulkar", "Muhammad Ali", "Serena Williams", "Roger Federer", "Neeraj Chopra"};
    }
}