package com.stduyjun.broadreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by hn on 2015/4/2.
 *
 * @TODO
 */
public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "receiver"+ intent.getStringExtra("regway"),Toast.LENGTH_SHORT).show();
    }
}
