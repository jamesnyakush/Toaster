package com.example.toastylibrary;

import android.content.Context;
import android.support.annotation.StringRes;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ToasterMessage {
    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final int LENGTH_LONG = Toast.LENGTH_LONG;

    public static void s(Context context, String message,int duration){


        LayoutInflater inflater = (LayoutInflater) context.getApplicationContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);


//        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

        View toastView = inflater.inflate(R.layout.succes, null);

        TextView text = (TextView) toastView.findViewById(R.id.customToastText);

        // Initiate the Toast instance.
        Toast toast = new Toast(context.getApplicationContext());

        toast.setView(toastView);

        text.setText(message);
        
        toast.setDuration(duration);
        toast.setGravity(Gravity.BOTTOM, 0,0);
        toast.show();

    }


}
