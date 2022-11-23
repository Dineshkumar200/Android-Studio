### EX NO : 03
### DATE  : 11/10//22
# <p align="center"> Develop a simple application to play and control the audio file in android studio </p>


## AIM:

To Develop a simple application to play and control the audio file in android studio.

## EQUIPMENTS REQUIRED:

Android Studio(Min.required Artic Fox)

## ALGORITHM:

Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name as HelloWorld and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout in activity_main.xml.

Step 6: Display message give in MainActivity file.

Step 7: Save and run the application.

## </br></br></br></br></br></br></br>PROGRAM:
```
/*

Developed by: Dineshkumar V
Registeration Number : 212220230013

```

activityMain.xml:

```java


<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Audio Controller"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.44"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.216" />

    <Button
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Start"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.429"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.329" />

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Pause"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.451"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.455" />

    <Button
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Stop"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.451"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.568" />

</androidx.constraintlayout.widget.ConstraintLayout>

```

MainActivity.java

```java


package com.example.audio3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button start,pause,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=(Button)findViewById(R.id.button1);
        pause=(Button)findViewById(R.id.button2);
        stop=(Button)findViewById(R.id.button3);
        //creating media player

        try{
            //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3


            MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.audio);

            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp.start();

                }
            });
            pause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp.pause();

                }
            });
            pause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp.stop();

                }
            });

        }catch(Exception e){e.printStackTrace();}



    }
}

```








## </br></br></br></br></br></br></br></br></br></br></br></br></br>OUTPUT

</br></br>
![Screenshot 2022-11-05 192134](https://user-images.githubusercontent.com/75235789/200123351-bdbff7bb-9fdb-4665-be22-3b0f3d4f60ef.jpg)


## </br></br></br>RESULT
Thus a Simple Android Application To Develop a simple application to play and control the audio file in android studio is developed and executed successfully.


