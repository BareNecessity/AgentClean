package com.example.agentclean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class PaymentActivity extends AppCompatActivity {
    Button addCode;
    CheckBox cash, card, wallet, coupon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        setViews();
    }

    private void setViews() {

       addCode = findViewById(R.id.add_to_cart_bt);
        card = findViewById(R.id.check_box_card_payment_cb);
        cash = findViewById(R.id.check_box_payment_cb);
        wallet = findViewById(R.id.check_box_wallet_cb);
        coupon = findViewById(R.id.check_box_coupon_cb);


        addCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}