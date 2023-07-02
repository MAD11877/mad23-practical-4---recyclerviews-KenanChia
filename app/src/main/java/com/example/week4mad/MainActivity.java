package com.example.week4mad;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String TAG = "RecyclerView";
    ArrayList<String> data = new ArrayList<>();
    ArrayList<User> myObject_List = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/* For simple first one
        for(int i = 0; i<100; i++){
            data.add(String.valueOf(i));
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        adapterDemo mAdapter = new adapterDemo(data);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

 */
        for(int i = 0; i<20; i++){
            Random random = new Random();
            long Name = random.nextLong() + 100000000L;// Generates ID bigger than  10million
            String ID = Long.toString(Name);
            long Desc = random.nextLong() + 100000000L;// Generates ID bigger than  10million
            String description = Long.toString(Desc);
            Log.v(TAG,ID);
            User obj = new User(ID, description, i,false);

            myObject_List.add(obj);
        }

        RecyclerView recyclerView = findViewById(R.id.profileView);
        myCustomAdaptor myCustomAdaptor = new myCustomAdaptor(myObject_List);
        LinearLayoutManager myLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(myLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myCustomAdaptor);


    }
}