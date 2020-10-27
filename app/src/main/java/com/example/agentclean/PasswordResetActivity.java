package com.example.agentclean;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class PasswordResetActivity extends AppCompatActivity {
    Button resetPassword;
    TextView accountCreate;
    ImageView backArrowReset;
    EditText newPassword, confirmNewPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_reset);

        setViews();
    }

    private void setViews() {
        resetPassword = findViewById(R.id.reset_bt);
        accountCreate = findViewById(R.id.create_account_tv);
        backArrowReset = findViewById(R.id.back_arrow_img);
        newPassword = findViewById(R.id.password_et);
        confirmNewPassword = findViewById(R.id.confirm_password_et);

       resetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        accountCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
       backArrowReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}