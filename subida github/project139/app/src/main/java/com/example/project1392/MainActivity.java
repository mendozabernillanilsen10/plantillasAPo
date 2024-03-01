package com.example.project1392;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCourses;
    public RecyclerView recyclerViewCources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<CourseDomain> ItemsArraylist = new ArrayList<>();

        ItemsArraylist.add(new CourseDomain("Quick Learn C# Language","Jammie young",128,4.6,"pic1"));
        ItemsArraylist.add(new CourseDomain("Full Course android Kotlin","Alex Alba",560,4.0,"pic2"));
        ItemsArraylist.add(new CourseDomain("Quick Learn Java Language","Sara Anderson",1000,4.7,"pic1"));

        recyclerViewCources = findViewById(R.id.view);
        recyclerViewCources.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapterCourses = new CourseAdapter(ItemsArraylist);
        recyclerViewCources.setAdapter(adapterCourses);
    }
}