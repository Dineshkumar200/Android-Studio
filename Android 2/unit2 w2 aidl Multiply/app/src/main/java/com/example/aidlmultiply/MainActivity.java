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