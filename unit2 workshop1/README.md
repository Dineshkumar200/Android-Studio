# Add Data to list and display the entered data on the screen. 


## AIM:

To Add Data to list and display the entered data on the screen. 

## EQUIPMENTS REQUIRED:

Android Studio(Min.required Artic Fox)

## ALGORITHM:

Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name  and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout in activity_main.xml.

Step 6: Display message give in MainActivity file.

Step 7: Save and run the application.

## PROGRAM:
```java

## activity_main.xml


<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="1dp"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/name"
        android:layout_width="411dp"
        android:layout_height="62dp"
        android:hint="Enter the name"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.242"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.023" />

    <Button
        android:id="@+id/button"
        android:layout_width="411dp"
        android:layout_height="73dp"
        android:text="Add"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.439"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.143" />

    <ListView
        android:id="@+id/listview"
        android:layout_width="411dp"
        android:layout_height="591dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.117"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="1.0"/>


</LinearLayout>




## MainActivity.java



package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> list;
    Button btnAdd;
    EditText editText;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        btnAdd=(Button) findViewById(R.id.button);
        editText=(EditText) findViewById(R.id.name);
        list=new ArrayList<String>();
        arrayAdapter =new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,list);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String names=editText.getText().toString();
                list.add(names);
                listView.setAdapter(arrayAdapter);
                arrayAdapter.notifyDataSetChanged();
            }
        });
    }
}
```

## OUTPUT


![k1](https://user-images.githubusercontent.com/75235789/166109582-6aaebc43-e18c-45d2-84b0-38a046d9c00c.jpg)
![k2](https://user-images.githubusercontent.com/75235789/166109577-acb14979-9bf9-45a7-a904-50d882944068.jpg)






## RESULT
Thus a Simple Android Application Add Data to list and display the entered data on the screen using Android Studio is developed and executed successfully.



