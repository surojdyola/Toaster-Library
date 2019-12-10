package com.cellpay.toasterlibrary;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class ToasterMessage {
    public static void s(Context c, String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

        Log.d("Hello","K bhAYO ");

    }
}
