package com.example.studentinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editName, editregno,editcgpa;
    TextView result;
    Button buttonSubmit, buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = (EditText) findViewById(R.id.e1);
        editregno = (EditText) findViewById(R.id.e2);
        editcgpa = (EditText) findViewById(R.id.e3);
        result = (TextView) findViewById(R.id.textView);
        buttonSubmit = (Button) findViewById(R.id.button3);
        buttonReset = (Button) findViewById(R.id.button4);
/*
Submit Button
*/
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String regno = editregno.getText().toString();
                String cgpa = editcgpa.getText().toString();
                result.setText("Name:\t" + name + "\nReg No:\t" + regno+"\nCGPA:\t"+cgpa );
            }
        });
/*
Reset Button
*/
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editName.setText("");
                editregno.setText("");
                editcgpa.setText("");
                result.setText("");
                editName.requestFocus();
            }
        });
    }
}