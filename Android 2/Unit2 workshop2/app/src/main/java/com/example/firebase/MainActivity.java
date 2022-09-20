package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.util.HashMap;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edit_name = findViewById(R.id.edit_name);
        final EditText edit_position = findViewById(R.id.edit_position);
        Button insert = findViewById(R.id.button);
        Button update = findViewById(R.id.button2);
        Button remove = findViewById(R.id.button3);
        DAOEmployee dao =new DAOEmployee();

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Employee emp = new Employee(edit_name.getText().toString(), edit_position.getText().toString());

                dao.add(emp).addOnSuccessListener(suc ->
                {
                    Toast.makeText(MainActivity.this, "Record is inserted", Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(er ->
                {
                    Toast.makeText(MainActivity.this, ""+ er.getMessage(), Toast.LENGTH_SHORT).show();
                });
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("name", edit_name.getText().toString());
                hashMap.put("position", edit_position.getText().toString());
                dao.update("-NBi1u6SrnPpv0ULy-Bp", hashMap).addOnSuccessListener(suc ->
                {
                    Toast.makeText(MainActivity.this, "Record is updated", Toast.LENGTH_SHORT).show();
                    finish();
                }).addOnFailureListener(er ->
                {
                    Toast.makeText(MainActivity.this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();

                });
            }
        });

       remove.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               dao.remove("-NBi1u6SrnPpv0ULy-Bp").addOnSuccessListener(suc ->
               {
                   Toast.makeText(MainActivity.this, "Record is removed", Toast.LENGTH_SHORT).show();
                   finish();
               }).addOnFailureListener(er ->
               {
                   Toast.makeText(MainActivity.this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();

               });

           }
       });





    }
}