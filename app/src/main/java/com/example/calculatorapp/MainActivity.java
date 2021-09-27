package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    public void addFunction(View v) {
        //Log.i("Info", "Button Pressed");
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        String str1 = num1.getText().toString();
        String str2 = num2.getText().toString();
        int num = (Integer.parseInt(str1) + Integer.parseInt(str2));
        String str = Integer.toString(num);
        goToActivity2(str);
    }

    public void subFunction(View v) {
        //Log.i("Info", "Button Pressed");
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        String str1 = num1.getText().toString();
        String str2 = num2.getText().toString();
        int num = (Integer.parseInt(str1) - Integer.parseInt(str2));
        String str = Integer.toString(num);
        goToActivity2(str);
    }
    public void multFunction(View v) {
        //Log.i("Info", "Button Pressed");
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        String str1 = num1.getText().toString();
        String str2 = num2.getText().toString();
        int num = (Integer.parseInt(str1) * Integer.parseInt(str2));
        String str = Integer.toString(num);
        goToActivity2(str);
    }
    public void divideFunction(View v) {
        //Log.i("Info", "Button Pressed");
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        String str1 = num1.getText().toString();
        String str2 = num2.getText().toString();
        int num = (Integer.parseInt(str1)/Integer.parseInt(str2));
        String str = Integer.toString(num);
        goToActivity2(str);
    }


}