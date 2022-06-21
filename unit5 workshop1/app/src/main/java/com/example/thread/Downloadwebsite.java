package com.example.thread;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class Downloadwebsite extends AsyncTask<String, Void ,String> {
    Context ctx;
    AlertDialog.Builder dialog;
   public  Downloadwebsite(Context ct)
   {
       ctx=ct;
   }
    @Override
    protected String doInBackground(String... strings) {
       String myweburl=strings[0];
        InputStream inputStream;
        try {
            URL myurl=new URL((myweburl));
            HttpURLConnection connection=(HttpURLConnection) myurl.openConnection();
            connection.setReadTimeout(100000);
            connection.setConnectTimeout(20000);
            connection.setRequestMethod("GET");
            connection.connect();

            inputStream=connection.getInputStream();
            BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder builder=new StringBuilder();
            String line;
            while ((line=reader.readLine()) !=null)
            {
                builder.append((line+"\n"));

            }
            inputStream.close();
            reader.close();
            return  builder.toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        dialog= new AlertDialog.Builder(ctx);
        dialog.setTitle("Congratulations");
        dialog.setMessage("Website Succecfully Downloaded");
        dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
                dialog.create().show();
                MainActivity.result.setText(s);
    }
}
