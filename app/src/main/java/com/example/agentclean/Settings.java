package com.example.agentclean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class Settings extends AppCompatActivity {
    Button myButton;
    ImageView backArrow,about, contactUs, termsPolicy ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        myButton = findViewById(R.id.submit_feedback_bt);
        backArrow = findViewById(R.id.settings_back_arrow);
        about = findViewById(R.id.about_forward_img);
        contactUs = findViewById(R.id.contact_us_forward_img);
        termsPolicy = findViewById(R.id.terms_policy_forward_img);
    }
}