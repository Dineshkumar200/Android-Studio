package com.example.thread;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    static EditText result;
    Button button;
    String weburl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =findViewById(R.id.editText);
        result=findViewById(R.id.result);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weburl=editText.getText().toString();
                Downloadwebsite myclass=new Downloadwebsite(MainActivity.this);
                myclass.execute(weburl);

            }
        });
    }
}