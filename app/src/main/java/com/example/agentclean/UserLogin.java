package com.example.agentclean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class UserLogin extends AppCompatActivity {
    Button myButton;
    ImageView backArrow;
    CheckBox checkBox;
    TextView forgotPassword, accountCreate;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        myButton = findViewById(R.id.login_button_bt);
        forgotPassword = findViewById(R.id.forgot_password_tv);
        backArrow = findViewById(R.id.back_arrow_4_img);
        accountCreate = findViewById(R.id.account_create_tv);
        checkBox = findViewById(R.id.checkbox_cb);




    }
}