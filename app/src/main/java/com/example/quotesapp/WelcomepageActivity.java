package com.example.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomepageActivity extends AppCompatActivity {
 CardView cardcontinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);
        initview();
    }

    private void initview() {
        cardcontinue=findViewById(R.id.cardcontinue);

        cardcontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(WelcomepageActivity.this,Welcomepage2Activity.class);
                startActivity(i);
            }
        });
    }
}