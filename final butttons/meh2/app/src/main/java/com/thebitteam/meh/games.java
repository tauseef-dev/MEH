package com.thebitteam.meh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.thebitteam.meh.R;



import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Bundle;
import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;



public class games extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        GPSTracker mGPS = new GPSTracker(this);

        webView=findViewById(R.id.games);

        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //https://html5games.com/
        webView.loadUrl("https://sites.google.com/view/meh-games");
        webView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.canGoBack();
        } else {
            super.onBackPressed();
        }
    }


}
