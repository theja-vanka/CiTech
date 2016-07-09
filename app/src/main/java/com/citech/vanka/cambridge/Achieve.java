package com.citech.vanka.cambridge;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Achieve extends AppCompatActivity {
    WebView myWebView;
    String myUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achieve);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        myWebView = (WebView)findViewById(R.id.achieve);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new MyWebViewClient());

        myWebView.loadUrl("file:///android_asset/www/Achievements.html");
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
