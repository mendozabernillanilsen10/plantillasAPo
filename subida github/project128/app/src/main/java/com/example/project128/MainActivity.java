package com.example.project128;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterContact;
    private RecyclerView recyclerViewContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerview();
    }

    private void initRecyclerview() {

        ArrayList<ContactsDomain> items = new ArrayList<>();

        items.add(new ContactsDomain("David", "user_1"));
        items.add(new ContactsDomain("Mary", "user_2"));
        items.add(new ContactsDomain("Jack", "user_3"));
        items.add(new ContactsDomain("Sara", "user_4"));
        items.add(new ContactsDomain("Rose", "user_5"));

        recyclerViewContact = findViewById(R.id.viewRec);
        recyclerViewContact.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterContact = new ContactAdaprer(items);
        recyclerViewContact.setAdapter(adapterContact);

    }
}