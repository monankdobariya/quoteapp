package com.example.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class HomepageActivity extends AppCompatActivity {
    RecyclerView rcv;
    ArrayList<Modalclass> Category = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        initview();
    }

    private void initview() {
        rcv = findViewById(R.id.rcv);

        Modalclass m1 = new Modalclass();
        m1.setName("Attitude");
        m1.setImage(R.drawable.attitude);
        Category.add(m1);

        Modalclass m2 = new Modalclass();
        m2.setName("Birthday");
        m2.setImage(R.drawable.birthday);
        Category.add(m2);

        Modalclass m3 = new Modalclass();
        m3.setName("Funny");
        m3.setImage(R.drawable.funny);
        Category.add(m3);

        Modalclass m4 = new Modalclass();
        m4.setName("Good Morning");
        m4.setImage(R.drawable.goodmorning);
        Category.add(m4);

        Modalclass m5 = new Modalclass();
        m5.setName("Love");
        m5.setImage(R.drawable.love);
        Category.add(m5);

        Modalclass m6 = new Modalclass();
        m6.setName("Motivational");
        m6.setImage(R.drawable.monivation);
        Category.add(m6);

        Modalclass m7 = new Modalclass();
        m7.setName("Break Up");
        m7.setImage(R.drawable.break_up);
        Category.add(m7);

        Modalclass m8 = new Modalclass();
        m8.setName("Beautiful");
        m8.setImage(R.drawable.beatuiful);
        Category.add(m8);

        Modalclass m9 = new Modalclass();
        m9.setName("Bike");
        m9.setImage(R.drawable.bike);
        Category.add(m9);

        Modalclass m10 = new Modalclass();
        m10.setName("Brother");
        m10.setImage(R.drawable.brothers);
        Category.add(m10);

        Modalclass m11 = new Modalclass();
        m11.setName("Angry");
        m11.setImage(R.drawable.angry);
        Category.add(m11);

        Modalclass m12 = new Modalclass();
        m12.setName("Anniversary");
        m12.setImage(R.drawable.anniversary);
        Category.add(m12);

        ReclerviewInterface myinterface = new ReclerviewInterface() {
            @Override
            public void click(String name) {
//                Toast.makeText(HomepageActivity.this, "your choice "+name, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(HomepageActivity.this, MainActivity2.class);
                i.putExtra("key",name);
                startActivity(i);
            }
        };

        RecyclerviewArraylistAdapter Adapter = new RecyclerviewArraylistAdapter(HomepageActivity.this, Category,myinterface);
        rcv.setAdapter(Adapter);
        GridLayoutManager manager = new GridLayoutManager(HomepageActivity.this, 2);
        rcv.setLayoutManager(manager);


    }
}