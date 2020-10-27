package com.example.agentclean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class LaundryRecordsActivity extends AppCompatActivity {
    TextView fundWallet;
    ImageView newRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry_records);

        setViews();
    }

    private void setViews() {
        fundWallet = findViewById(R.id.fund_wallet_tv);
        newRequest = findViewById(R.id.add_wallet_balance_img_bt);

        fundWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        newRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}