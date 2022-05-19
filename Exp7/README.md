# Ex.No:7 Develop a simple calculator using android studio.

## AIM:

To develop a program to develop a simple calculator in Android Studio.

## EQUIPMENTS REQUIRED:

Android Studio(Min.required Artic Fox)

## ALGORITHM:

Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name as calculator and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout using UI components in activity_main.xml.

Step 6: Display the calculator operation in MainActivity file.

Step 7: Save and run the application.

## PROGRAM:
```
/*
Program to print the text “calculator operation”.
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

    <EditText
        android:id="@+id/editText2"
        android:layout_width="163dp"
        android:layout_height="39dp"
        android:layout_marginBottom="40dp"
        android:hint="Enter number 2"
        android:inputType="number"
        app:layout_constraintBottom_toTopOf="@+id/buttonsum"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.508"
        app:layout_constraintStart_toStartOf="parent" />

    <EditText
        android:id="@+id/editText1"
        android:layout_width="163dp"
        android:layout_height="39dp"
        android:layout_marginBottom="100dp"
        android:hint="Enter  number 1"
        android:inputType="number"
        app:layout_constraintBottom_toTopOf="@+id/buttonsum"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.508"
        app:layout_constraintStart_toStartOf="parent" />

    <Button
        android:id="@+id/buttonsum"
        android:layout_width="170dp"
        android:layout_height="59dp"
        android:text="Addition"
        app:layout_constraintBottom_toTopOf="@+id/buttonmul"
        app:layout_constraintEnd_toStartOf="@+id/buttonsub"
        app:layout_constraintHorizontal_bias="0.56"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.918" />

    <Button
        android:id="@+id/buttonsub"
        android:layout_width="155dp"
        android:layout_height="57dp"
        android:layout_marginEnd="32dp"
        android:text="Subtraction"
        app:layout_constraintBottom_toTopOf="@+id/buttondiv"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.909" />

    <Button
        android:id="@+id/buttondiv"
        android:layout_width="150dp"
        android:layout_height="57dp"
        android:layout_marginEnd="36dp"
        android:layout_marginBottom="308dp"
        android:text="Division"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <Button
        android:id="@+id/buttonmul"
        android:layout_width="166dp"
        android:layout_height="58dp"
        android:layout_marginBottom="308dp"
        android:text="multiplication"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/buttondiv"
        app:layout_constraintHorizontal_bias="0.54"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:id="@+id/textView1"
        android:layout_width="166dp"
        android:layout_height="71dp"
        android:textAppearance="?android:attr/textAppearanceLarge"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.609"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editText2"
        app:layout_constraintVertical_bias="0.452" />

</androidx.constraintlayout.widget.ConstraintLayout>




## MainActivity.java



package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnsum = (Button) findViewById(R.id.buttonsum);
        Button btnsub = (Button) findViewById(R.id.buttonsub);
        Button btndiv = (Button) findViewById(R.id.buttondiv);
        Button btnmul = (Button) findViewById(R.id.buttonmul);
        final EditText etv = (EditText) findViewById(R.id.editText1);
        final EditText etv2 = (EditText) findViewById(R.id.editText2);
        final TextView result = (TextView) findViewById(R.id.textView1);

        btnsum.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int sum = x + y;
                result.setText( x + " + " + y + " = " + sum);
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int sub = x - y;
                result.setText( x + " - " + y + " = " + sub);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                double div = (float)x /(float) y;
                result.setText(x + " / " + y + " = " + div);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int mul = x * y;
                result.setText(x + " * " + y + " = " + mul);
            }
        });


    }
}


```

## OUTPUT



<br/>![an5](https://user-images.githubusercontent.com/75235789/169348674-dcbb23e9-6129-4fc3-8c3c-afb0ba35eff6.jpg)
![an6](https://user-images.githubusercontent.com/75235789/169348668-441ddf88-ffbb-4492-9b28-b3fb7ed10cd4.jpg)

![an7](https://user-images.githubusercontent.com/75235789/169348663-a822f63f-2797-49e3-8731-9e885f1e6888.jpg)
![an8](https://user-images.githubusercontent.com/75235789/169348650-bf3b3ab2-8ddc-46dc-b7d0-86351d31c4e9.jpg)



![an9](https://user-images.githubusercontent.com/75235789/169348678-579e054b-3a1f-4950-8a82-0dec4cac6698.jpg)



## <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>RESULT
Thus a Simple Android Application develop a program to create simple calculator in Android Studio is developed and executed successfully.

