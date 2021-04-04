package com.ossovita.broadcastexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ExampleBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "ExampleBroadcastReceive";
    @Override
    public void onReceive(Context context, Intent intent) {
        if(Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction())){
            Log.d(TAG, "onReceive: airplane mode: "  + intent.getBooleanExtra("state",false));
        }
    }
}
