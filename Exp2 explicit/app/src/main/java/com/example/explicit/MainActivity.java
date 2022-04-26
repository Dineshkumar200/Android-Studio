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