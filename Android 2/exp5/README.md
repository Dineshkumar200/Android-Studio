### EX NO : 05
### DATE  : 09/11/22
# <p align="center"> Develop a simple application for proximity sensor using Sensor Manager in android studio </p>


## AIM:

To develop a sensor application for proximity sensor using sensor manager in Android Studio.

## EQUIPMENTS REQUIRED:

Android Studio(Min.required Artic Fox)

## ALGORITHM:

Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name as proximitysensor and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout in activity_main.xml.

Step 6: Display process of proximitysensor in android mobile devices.

Step 7: Save and run the application.

## </br></br></br></br></br></br></br></br>PROGRAM:
```
/*
Program to print the process of proximitysensor in android mobile devices”.
Developed by: Dineshkumar V
Registeration Number : 212220230013
*/
```

Activity_Main.xml

```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/text"
        android:layout_width="299dp"
        android:textSize="60dp"
        android:layout_height="453dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.589"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.816" />

</androidx.constraintlayout.widget.ConstraintLayout>

```
Main_Activtiy.java

```java
package com.example.proximitysensor;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView sensorStatusTV;
    SensorManager sensorManager;
    Sensor proximitySensor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorStatusTV = findViewById(R.id.text);

        // calling sensor service.
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        // from sensor service we are
        // calling proximity sensor
        proximitySensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        // handling the case if the proximity
        // sensor is not present in users device.
        if (proximitySensor == null) {
            Toast.makeText(this, "No proximity sensor found in device.", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            // registering our sensor with sensor manager.
            sensorManager.registerListener(proximitySensorEventListener,
                    proximitySensor,
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    // calling the sensor event class to detect
    // the change in data when sensor starts working.
    SensorEventListener proximitySensorEventListener = new SensorEventListener() {
        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
            // method to check accuracy changed in sensor.
        }

        @Override
        public void onSensorChanged(SensorEvent event) {
            // check if the sensor type is proximity sensor.
            if (event.sensor.getType() == Sensor.TYPE_PROXIMITY) {
                if (event.values[0] == 0) {
                    // here we are setting our status to our textview..
                    // if sensor event return 0 then object is closed
                    // to sensor else object is away from sensor.
                    sensorStatusTV.setText("Near");
                } else {
                    sensorStatusTV.setText("Away");
                }
            }
        }
    };
}

```

## </br></br></br></br></br></br></br>OUTPUT

![Screenshot 2022-11-13 154823](https://user-images.githubusercontent.com/75235789/201517404-0a1546ac-5ffd-45d6-a9cc-a0ada6e5cf5f.jpg)

</br></br></br></br>
![Screenshot 2022-11-13 154835](https://user-images.githubusercontent.com/75235789/201517405-744ae8e6-6d14-4039-b329-d4c7e6a2d67f.jpg)

## </br></br></br></br>RESULT
Thus a Simple Android Application to display the details of proximity sensor using sensor manager in Android Studio is developed and executed successfully.

