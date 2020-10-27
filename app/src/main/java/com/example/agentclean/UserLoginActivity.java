package com.example.agentclean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class UserLoginActivity extends AppCompatActivity {
    Button loginBtn;
    ImageView backArrowImg;
    EditText emailLogin, passwordLogin;
    CheckBox checkBoxCb;
    TextView forgotPasswordTv, accountCreateTv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        setViews();
    }

    private void setViews() {
        loginBtn = findViewById(R.id.login_button_bt);
        forgotPasswordTv = findViewById(R.id.forgot_password_tv);
        backArrowImg = findViewById(R.id.back_arrow_4_img);
        accountCreateTv = findViewById(R.id.account_create_tv);
        checkBoxCb = findViewById(R.id.checkbox_cb);
        emailLogin = findViewById(R.id.email_login_et);
        passwordLogin = findViewById(R.id.password_login_et);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (areDetailsValid()){

                }else{
                    Toast.makeText(getApplicationContext(),"Invalid input", Toast.LENGTH_SHORT).show();
                }

            }
        });

        forgotPasswordTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        accountCreateTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        backArrowImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }

    private boolean areDetailsValid() {
        if (emailLogin.getText().toString().isEmpty() || passwordLogin.getText().toString().length() < 6){
            return false;
        }
        else{
            return true;
        }
    }
}