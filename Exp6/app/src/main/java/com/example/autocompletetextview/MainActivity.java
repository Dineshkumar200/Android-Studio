package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView text;
    MultiAutoCompleteTextView text1;
    String[] languages={"Python ","java","C++","C#","JDBC","Web development"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);

        ArrayAdapter adapter = new
                ArrayAdapter(this,android.R.layout.simple_list_item_1,languages);

        text.setAdapter(adapter);
        text.setThreshold(1);

    }
}