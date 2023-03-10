package com.example.hitianinside;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class gallery extends AppCompatActivity {
    GridView gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_gallery);
        gridview= (GridView) findViewById(R.id.grid_view1);
        gridview.setAdapter(new imageadapter(this));



    }
}