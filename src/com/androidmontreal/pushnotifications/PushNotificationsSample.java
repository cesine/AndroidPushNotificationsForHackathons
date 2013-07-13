package com.androidmontreal.pushnotifications;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PushNotificationsSample extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.simple);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.google_cloud_messaging_sample, menu);
    return true;
  }

}
