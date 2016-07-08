package com.citech.vanka.cambridge.Subclass;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.citech.vanka.cambridge.R;

public class FacBas extends AppCompatActivity {
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fac_bas);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        myWebView = (WebView)findViewById(R.id.fbas);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("file:///android_asset/www/faculty_science.html");
    }
    @Override
    public void onBackPressed() {

        super.onBackPressed();
        //additional code
    }
}
