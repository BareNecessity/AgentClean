package com.example.agentclean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        fundWallet = findViewById(R.id.fund_wallet_tv);
        newRequest = findViewById(R.id.add_wallet_balance_img_bt);
    }
}