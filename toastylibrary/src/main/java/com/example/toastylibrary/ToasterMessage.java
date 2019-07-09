package com.example.toastylibrary;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context c, String message){

        LayoutInflater inflater = (LayoutInflater) c.getApplicationContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);


//        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

        View toastView = inflater.inflate(R.layout.succes, null);

        // Initiate the Toast instance.
        Toast toast = new Toast(c.getApplicationContext());
        // Set custom view in toast.
        toast.setView(toastView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();

    }


}
