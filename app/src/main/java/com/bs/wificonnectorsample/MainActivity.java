package com.bs.wificonnectorsample;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends WiFiBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        handleWIFI();
    }

    @Override
    protected int getSecondsTimeout() {
        return 100;
    }

    @Override
    protected String getWifiSSID() {
        return "Your SSID";
    }

    @Override
    protected String getWifiPass() {
        return "Password";
    }
}
