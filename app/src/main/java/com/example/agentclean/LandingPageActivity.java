package com.example.agentclean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class LandingPageActivity extends AppCompatActivity {
    Button newUser, existingUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        newUser = findViewById(R.id.new_user_bt);
        existingUser =findViewById(R.id.existing_user_bt);
    }

}