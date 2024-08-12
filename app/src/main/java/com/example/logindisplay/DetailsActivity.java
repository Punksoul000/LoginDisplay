package com.example.logindisplay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    private TextView detailsTextView;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        detailsTextView = findViewById(R.id.detailsTextView);
        logoutButton = findViewById(R.id.logoutButton);

        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");
        String password = intent.getStringExtra("PASSWORD");

        detailsTextView.setText("Username: " + username + "\nPassword: " + password);

        logoutButton.setOnClickListener(new View.OnClickListener() {


            class LoginActivity {
            }

            @Override
            public void onClick(View v) {
                Intent logoutIntent = new Intent(DetailsActivity.this, LoginActivity.class);
                startActivity(logoutIntent);
                finish(); // Optionally close this activity
              }
           });
       }
    }

