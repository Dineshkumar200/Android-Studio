# Ex.No:6
Build a program to create a first display screen of any search engine using Auto Complete Text View.

## AIM:

To develop a program to create a first display screen of any search engine using AutoComplete TextView in Android Studio.

## EQUIPMENTS REQUIRED:

Android Studio(Min.required Artic Fox)

## ALGORITHM:

Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name as searchengine and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout using AutoComplete TextView in activity_main.xml.

Step 6: Display screen of search engine in MainActivity file.

Step 7: Save and run the application.

## PROGRAM:
```
/*
Program to print the text “display screen of any search engine”.
Developed by: Dineshkumar V
Registeration Number : 212220230013
*/
```
```java

## activity_main.xml


<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">



    <AutoCompleteTextView
        android:id="@+id/autoCompleteTextView"
        android:layout_width="200dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="104dp"
        android:layout_marginTop="248dp"
        android:text=""
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Enter your Favourite Language"
        android:textColor="@color/black"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.473"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.189" />


</androidx.constraintlayout.widget.ConstraintLayout>



## MainActivity.java



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


```

## <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>OUTPUT


![an3](https://user-images.githubusercontent.com/75235789/169343189-89e545c7-785e-4523-af60-176b70c11c10.jpg)

<br/>![an4](https://user-images.githubusercontent.com/75235789/169343156-37462f1d-5e1a-4c61-851c-37b012576ddc.jpg)



## RESULT
Thus a Simple Android Application develop a program to create a first display screen of any search engine using AutoComplete TextView in Android Studio is developed and executed successfully.

