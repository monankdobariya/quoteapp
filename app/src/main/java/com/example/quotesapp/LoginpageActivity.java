package com.example.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginpageActivity extends AppCompatActivity {
    CardView cardlogin;
    TextInputEditText edtusename, edtpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        initview();
    }

    private void initview() {
        cardlogin=findViewById(R.id.cardlogin);
        edtusename = findViewById(R.id.edtusename);
        edtpassword = findViewById(R.id.edtpassword);

        cardlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username, password;
                username = edtusename.getText().toString();
                password = edtpassword.getText().toString();
                if (username.isEmpty()) {
                    Toast.makeText(LoginpageActivity.this, "Please enter your username", Toast.LENGTH_SHORT).show();
                } else
                {
                    if (password.isEmpty())
                    {
                        Toast.makeText(LoginpageActivity.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Intent i=new Intent(LoginpageActivity.this,HomepageActivity.class);
                        startActivity(i);
                    }
                }
            }
        });
    }
}