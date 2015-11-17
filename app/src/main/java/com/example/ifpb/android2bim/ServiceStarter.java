package com.example.ifpb.android2bim;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import 	android.app.Service;
import android.util.Log;

public class ServiceStarter extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)) {
            Intent serviceIntent = new Intent("Splash");
            context.startService(serviceIntent);
        }
    }
}