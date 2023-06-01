package com.example.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Welcomepage2Activity extends AppCompatActivity {
CardView cardcontinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage2);
        initview();
    }

    private void initview() {
        cardcontinue=findViewById(R.id.cardcontinue);

        cardcontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Welcomepage2Activity.this,LoginpageActivity.class);
                startActivity(i);
            }
        });
    }
}