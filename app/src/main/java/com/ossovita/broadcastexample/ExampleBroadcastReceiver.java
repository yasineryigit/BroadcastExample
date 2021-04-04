package com.ossovita.broadcastexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class ExampleBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {//gelen aksiyon boot completed ise
            Toast.makeText(context, "Boot completed", Toast.LENGTH_SHORT).show();
        }
        if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction())) {
            Toast.makeText(context, "Airplane mode changed", Toast.LENGTH_SHORT).show();
        }
    }
}
