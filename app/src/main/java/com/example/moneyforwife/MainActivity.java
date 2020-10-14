package com.example.moneyforwife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity{

    TextView textViewTotal;
    Button buttonGo, buttonRestart;
    Spinner spinnerMoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTotal = findViewById(R.id.textViewTotal);
        buttonGo = findViewById(R.id.buttonGo);
        buttonRestart = findViewById(R.id.buttonRestart);
        spinnerMoney = findViewById(R.id.spinnerMoney);
        clickedGetMoney();

    }

    private void clickedGetMoney() {

        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int start = 20000;
                int end = 50000;
                int randomNumber = start + (int) (Math.random() * end);
                textViewTotal.setText("" + (int) (Math.round(randomNumber / 1000.0) * 1000));
                buttonGo.setEnabled(false);
                spinnerMoney.setEnabled(false);

            }
        });

        buttonRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonGo.setEnabled(true);
                spinnerMoney.setEnabled(true);
            }
        });
    }

}