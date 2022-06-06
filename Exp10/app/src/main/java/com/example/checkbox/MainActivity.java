package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox ch1, ch2, ch3, ch4, ch5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch1 = (CheckBox) findViewById(R.id.checkBox);

        ch2 = (CheckBox) findViewById(R.id.checkBox2);

        ch3 = (CheckBox) findViewById(R.id.checkBox3);

        ch4 = (CheckBox) findViewById(R.id.checkBox4);

        ch5 = (CheckBox) findViewById(R.id.checkBox5);


        ch1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "BMW", Toast.LENGTH_LONG).show();

            }
        });
        ch2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "R15", Toast.LENGTH_LONG).show();

            }
        });

        ch3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "DUKE", Toast.LENGTH_LONG).show();

            }
        });

        ch4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "KTM", Toast.LENGTH_LONG).show();

            }
        });

        ch5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "KAWASAKI", Toast.LENGTH_LONG).show();

            }
        });



    }
}