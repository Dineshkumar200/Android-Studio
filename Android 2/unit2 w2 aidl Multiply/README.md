# Activitymain.xml

```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="260dp"
        android:layout_height="90dp"
        android:textSize="36sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.562"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.75" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Multiply"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.541"
        android:onClick="multiply"/>

    <EditText
        android:id="@+id/editTextTextPersonName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="Enter a Number"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.392" />

    <EditText
        android:id="@+id/editTextTextPersonName2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="Enter a Number"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.236" />

</androidx.constraintlayout.widget.ConstraintLayout>

```


# MainActivity.java

```java
package com.example.aidlmultiply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     IMultiplyService mservice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=new Intent(this, MultiplyService.class);
        bindService(intent,mConnection, Context.BIND_AUTO_CREATE);
    }

    ServiceConnection mConnection= new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            mservice =IMultiplyService.Stub.asInterface(service);

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };


    public void multiply(View view) throws RemoteException {
        TextView txt=(TextView) findViewById(R.id.textView);
        EditText edit1=(EditText) findViewById(R.id.editTextTextPersonName);
        EditText edit2=(EditText) findViewById(R.id.editTextTextPersonName2);
        int v1=Integer.parseInt(edit1.getText().toString());
        int v2=Integer.parseInt(edit2.getText().toString());
        int result=mservice.multiply(v1,v2);
        txt.setText("Result = "+result);
    }

}

```


# MultiplyService.java

```java

package com.example.aidlmultiply;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MultiplyService extends Service {
    public MultiplyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
    IMultiplyService.Stub mBinder =new IMultiplyService.Stub() {
        @Override
        public int multiply(int x, int y) throws RemoteException {
            return x*y;
        }
    };
}

```


# Output

![Screenshot 2022-11-24 164442](https://user-images.githubusercontent.com/75235789/203771846-a54c20bd-5e12-4f25-8461-e6827db98c07.jpg)
![Screenshot 2022-11-24 164503](https://user-images.githubusercontent.com/75235789/203771860-ede70a2d-09b8-4312-8629-78cb7e833be3.jpg)

