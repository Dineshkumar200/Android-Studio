
# Ex.No:2b
# Explicit Intents

Develop program to create two screens , first screen will take one number input from user. After click on Factorial button, second screen will open and it should display factorial of the same number using Explicit Intents.


## AIM:

To create a layout display factorial number using Explicit Intents in Android Studio.

## EQUIPMENTS REQUIRED:

Android Studio(Min. required Artic Fox)

## ALGORITHM:

Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name as “ex.no.2″ and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout in activity_main.xml.

Step 6: Display factorial number using Explicit Intents in MainActivity file.

Step 7: Save and run the application.

## PROGRAM:
```
/*
Program to print the text “Explicit Intents”.
Developed by: Dineshkumar V
Registeration Number : 212220230013
*/



## activity_main.xml

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="388dp"
        android:layout_marginEnd="8dp"
        android:onClick="callSecondActivity"
        android:text="Factorial"
        android:textColor="@android:color/black"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.408"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/editText"
        android:layout_width="146dp"
        android:layout_height="76dp"
        android:hint="Enter a number"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.434"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.364" />


</androidx.constraintlayout.widget.ConstraintLayout>


## MainActivity.java


package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText numText;
    private Button button;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numText=findViewById(R.id.editText);
        button=findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=Integer.parseInt(numText.getText().toString().trim());
                if(num<2){
                    num=1;
                }
                else{
                    int sum=1,i;
                    for(i=1;i<=num;i++){
                        sum=sum*i;
                    }
                    num=sum;
                }
                sendData(num);
            }
        });
    }
    public  void sendData(int num){

        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra(MainActivity2.NUM,num);
        startActivity(i);
    }

}



## activity_main2.xml


<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity2">


    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="392dp"
        android:layout_marginEnd="8dp"
        android:onClick="callFirstActivity"
        android:text="Exit"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="TextView"
        app:layout_constraintBottom_toTopOf="@+id/button"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.815" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="The Factorial of the given number is"
        android:textColor="@android:color/black"
        app:layout_constraintBottom_toTopOf="@+id/textView"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.901" />

</androidx.constraintlayout.widget.ConstraintLayout>




## MainActivity2.java


package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String NUM="NUM";
    private TextView numText;
    private  int num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        numText=findViewById(R.id.textView);
        Intent i =getIntent();
        num=i.getIntExtra(NUM,0);
        numText.setText(""+num);
    }
    public void callFirstActivity(View view){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }

}
```
## OUTPUT


![i4](https://user-images.githubusercontent.com/75235789/165368196-537b7bee-d5ce-48f3-9ab0-934e6b779fd8.jpg)

![i5](https://user-images.githubusercontent.com/75235789/165368211-1041dcf0-a6ce-47a3-83a2-bc2ec7346ef0.jpg)
![i6](https://user-images.githubusercontent.com/75235789/165368232-fe8069a6-4578-4000-b173-ea54f43296b4.jpg)

## RESULT
Thus a Simple Android Application to  display factorial of the same number using Explicit Intents using Android Studio is developed and executed successfully.


