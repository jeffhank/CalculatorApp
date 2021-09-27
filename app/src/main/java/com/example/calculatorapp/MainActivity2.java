package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView secondView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        secondView = (TextView) findViewById(R.id.secondView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        secondView.setText(str);
    }
}