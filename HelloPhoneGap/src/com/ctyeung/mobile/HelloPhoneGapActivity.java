package com.ctyeung.mobile;

import android.os.Bundle;
import org.apache.cordova.*;

import android.os.Bundle;

public class HelloPhoneGapActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
        //setContentView(R.layout.main);
    }
}