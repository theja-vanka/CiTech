package com.citech.vanka.cambridge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class About extends AppCompatActivity {
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        myWebView = (WebView)findViewById(R.id.about);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("file:///android_asset/about/home.html");
    }
    @Override
    public void onBackPressed() {

        super.onBackPressed();
        //additional code
    }

}
