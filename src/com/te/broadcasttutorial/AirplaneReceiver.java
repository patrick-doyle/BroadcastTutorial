package com.te.broadcasttutorial;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Toast.makeText(context,"Airplane mode Changed",Toast.LENGTH_SHORT).show();

	}

}
