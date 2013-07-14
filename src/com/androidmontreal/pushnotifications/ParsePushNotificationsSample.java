package com.androidmontreal.pushnotifications;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseInstallation;
import com.parse.PushService;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * Setup time estimate:
 * 
 * 20 min
 * 
 * Step: All are easy to follow steps when you sign up on parse.com
 * 
 */
public class ParsePushNotificationsSample extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.simple);
    ParseAnalytics.trackAppOpened(getIntent());

  }

  @Override
  protected void onResume() {
    super.onResume();
    /*
     * Sign up on parse.com and paste your keys here for your own app
     */
    Parse.initialize(this, "appid", "clientkey");

    PushService.setDefaultPushCallback(this, ParsePushNotificationsSample.class);
    ParseInstallation.getCurrentInstallation().saveInBackground();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.google_cloud_messaging_sample, menu);
    return true;
  }

}
