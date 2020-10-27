package com.example.agentclean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class UserLoginActivity extends AppCompatActivity {
    Button myButton;
    ImageView backArrow;
    CheckBox checkBox;
    TextView forgotPassword, accountCreate;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        setViews();
    }

    private void setViews() {
        myButton = findViewById(R.id.login_button_bt);
        forgotPassword = findViewById(R.id.forgot_password_tv);
        backArrow = findViewById(R.id.back_arrow_4_img);
        accountCreate = findViewById(R.id.account_create_tv);
        checkBox = findViewById(R.id.checkbox_cb);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        accountCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }
}