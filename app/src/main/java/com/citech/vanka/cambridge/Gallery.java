package com.citech.vanka.cambridge;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Gallery extends AppCompatActivity {
    WebView myWebView;
    String myUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        myWebView = (WebView)findViewById(R.id.gal);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new MyWebViewClient());
       // myWebView.loadUrl("www.google.com");
        myWebView.loadUrl("file:///android_asset/www/gallery_home.html");
    }
    @Override
    public void onBackPressed() {

        if(myWebView.canGoBack())
        {
            myWebView.goBack();
        }

        else {
            super.onBackPressed();
        }
        //additional code
    }
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            myUrl = url;
            view.loadUrl(url);
            return true;
        }
    }
}
