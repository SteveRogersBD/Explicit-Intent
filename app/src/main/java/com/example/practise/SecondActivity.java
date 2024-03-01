package com.example.practise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        add = findViewById(R.id.sum);
        Intent intent = getIntent();
        int sum = intent.getIntExtra("Sum",0); //default value 0
        add.setText(String.valueOf(sum));
    }
}