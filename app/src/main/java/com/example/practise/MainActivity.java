package com.example.practise;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText one, two;
    Button add;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.first);
        two = findViewById(R.id.second);
        add = findViewById(R.id.Add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Moved inside the OnClickListener to ensure it captures user input
                int num1 = Integer.parseInt(one.getText().toString());
                int num2 = Integer.parseInt(two.getText().toString()); // Corrected to read from 'two'

                int sum = num1 + num2;

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Sum", sum); //sending the data
                startActivity(intent);
            }
        });
    }
}
