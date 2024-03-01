package com.example.project1073.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.project1073.Adapter.CategoryAdapter;
import com.example.project1073.Adapter.FastDeliveryAdapter;
import com.example.project1073.Domain.CategoryDomain;
import com.example.project1073.Domain.FastDeliveryDomain;
import com.example.project1073.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerViewCategory, recyclerViewfastList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_LTR);

        recyclerViewCategory();
        recyclerViewfastList();
    }

    private void recyclerViewfastList() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewfastList = findViewById(R.id.view2);
        recyclerViewfastList.setLayoutManager(linearLayoutManager);

        ArrayList<FastDeliveryDomain> fastDeliveryDomains = new ArrayList<>();
        fastDeliveryDomains.add(new FastDeliveryDomain("Chesse Burger", "fast_1", 9.0, 20));
        fastDeliveryDomains.add(new FastDeliveryDomain("Pepperoni pizza", "fast_2", 8.1, 16));
        fastDeliveryDomains.add(new FastDeliveryDomain("vagetable pizza", "fast_3", 9.5, 16));

        adapter2 = new FastDeliveryAdapter(fastDeliveryDomains);
        recyclerViewfastList.setAdapter(adapter2);
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategory = findViewById(R.id.view1);
        recyclerViewCategory.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categoryList = new ArrayList<>();
        categoryList.add(new CategoryDomain("Pizza", "cat_1"));
        categoryList.add(new CategoryDomain("Burger", "cat_2"));
        categoryList.add(new CategoryDomain("Chicken", "cat_3"));
        categoryList.add(new CategoryDomain("Hotdog", "cat_4"));

        adapter = new CategoryAdapter(categoryList);
        recyclerViewCategory.setAdapter(adapter);
    }
}