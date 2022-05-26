# Create a To Do List application using android studio. You can use the different layout, views and controls in android.


## AIM:

To create a To Do List application using android studio. You can use the different layout, views and controls in android.

## EQUIPMENTS REQUIRED:

Android Studio(Min.required Artic Fox)

## ALGORITHM:

Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name as studentinfo and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout in activity_main.xml.

Step 6: import the images in drawable fplder 

Step 7: Save and run the application.

## PROGRAM:
```
/*
Developed by: Dineshkumar V
Registeration Number : 212220230013
*/
```




## Activity_Main.xml

```xml
<?xml version="1.0" encoding="utf-8"?>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <ListView
        android:id="@+id/simpleListView"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:divider="@color/material_blue_grey_800"
        android:dividerHeight="1dp"
        android:footerDividersEnabled="false" />

</LinearLayout>

```



##  MainActivity.java
```java


package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
    int flags[] = {R.drawable.india, R.drawable.china, R.drawable.astralia, R.drawable.portugle, R.drawable.america, R.drawable.newzealand};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);

    }
}

```
## activity_listview.xml:
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <ImageView
        android:id="@+id/icon"
        android:layout_width="91dp"
        android:layout_height="74dp" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="227dp"
        android:layout_height="55dp"
        android:layout_gravity="center"

        android:textColor="@color/black" />

</LinearLayout>
```
## CustomAdaptor.Java
```
package com.example.project3;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String countryList[];
    int flags[];
    LayoutInflater inflter;
    public CustomAdapter(Context applicationContext, String[] countryList, int[] flags) {
        this.context = context;
        this.countryList = countryList;
        this.flags = flags;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_layout, null);
        TextView country = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        country.setText(countryList[i]);
        icon.setImageResource(flags[i]);
        return view;
    }
}



```
## OUTPUT

![Screenshot 2022-05-26 213230](https://user-images.githubusercontent.com/75235789/170527789-f48bfc8d-fef8-4063-bef8-208fa46f7725.jpg)





## RESULT
Thus,To Do List application using android studio is creayed successfully

