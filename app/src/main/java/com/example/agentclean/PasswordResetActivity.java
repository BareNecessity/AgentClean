package com.example.agentclean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PasswordResetActivity extends AppCompatActivity {
    Button myButton;
    TextView accountCreate;
    ImageView backArrow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_reset);
        myButton = findViewById(R.id.reset_bt);
        accountCreate = findViewById(R.id.create_account_tv);
        backArrow = findViewById(R.id.back_arrow_img);
    }
}