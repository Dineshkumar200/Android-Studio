
# To create an application and display the fruit name while clicking any three checkbox.Give input more than 6 fruit name in that select three fruit name.


## PROGRAM:


``` java
## activity_main.xml:


<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <CheckBox
        android:id="@+id/checkBox"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Apple"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.478"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.2" />

    <CheckBox
        android:id="@+id/checkBox2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Banana"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.493"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.322" />

    <CheckBox
        android:id="@+id/checkBox3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Orange"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.439" />

    <CheckBox
        android:id="@+id/checkBox4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Musk Melon"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.549"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.546" />

    <CheckBox
        android:id="@+id/checkBox5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Mango"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.663" />

    <CheckBox
        android:id="@+id/checkBox6"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Promo Granete"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.582"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.775" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Selecty your Fruit"
        android:textColor="@color/black"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.113" />

</androidx.constraintlayout.widget.ConstraintLayout>


## MainActivity.java:


package com.example.checkbox2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox ch1, ch2, ch3, ch4, ch5,ch6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch1 = (CheckBox) findViewById(R.id.checkBox);

        ch2 = (CheckBox) findViewById(R.id.checkBox2);

        ch3 = (CheckBox) findViewById(R.id.checkBox3);

        ch4 = (CheckBox) findViewById(R.id.checkBox4);

        ch5 = (CheckBox) findViewById(R.id.checkBox5);
        ch6 = (CheckBox) findViewById(R.id.checkBox6);


        ch1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Apple", Toast.LENGTH_LONG).show();

            }
        });
        ch2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Banana", Toast.LENGTH_LONG).show();

            }
        });

        ch3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Orange", Toast.LENGTH_LONG).show();

            }
        });

        ch4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Musk Melon", Toast.LENGTH_LONG).show();

            }
        });

        ch5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Mango", Toast.LENGTH_LONG).show();
            }
        });
        ch6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "PomoGranet", Toast.LENGTH_LONG).show();
            }
        });
    }
}

```
## OUTPUT



![Screenshot 2022-06-20 092511](https://user-images.githubusercontent.com/75235789/174523461-173d6439-ce64-47c1-9557-e1647f752a84.jpg)
![Screenshot 2022-06-20 092524](https://user-images.githubusercontent.com/75235789/174523455-689bf784-0544-4b6e-a6e6-9f3d1524d41b.jpg)
![Screenshot 2022-06-20 092537](https://user-images.githubusercontent.com/75235789/174523450-83afb6a4-391b-4504-9aa1-9eb17d63814d.jpg)
![Screenshot 2022-06-20 092557](https://user-images.githubusercontent.com/75235789/174523463-291de005-f74b-4886-8f75-47390947b8f3.jpg)




