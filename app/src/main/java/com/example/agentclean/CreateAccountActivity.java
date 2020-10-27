package com.example.agentclean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateAccountActivity extends AppCompatActivity {
    Button createAccount;
    EditText emailAddress, mobileNumber, passwordCreate, confirmPasswordCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        setViews();
    }

    private void setViews() {
        createAccount = findViewById(R.id.button_create_bt);
        emailAddress = findViewById(R.id.enter_email_et);
        mobileNumber = findViewById(R.id.edit_mobile_et);
        passwordCreate = findViewById(R.id.edit_password_et);
        confirmPasswordCreate = findViewById(R.id.log_password_et);

       createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}