package com.thebitteam.meh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class forum extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
        webView = findViewById(R.id.for_web);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://www.mentalhealthforum.net/?__cf_chl_captcha_tk__=6e58a44db1e07d7366a9c5179465648121b1154c-1583558981-0-AT8ikEEzVJSibb6UR29rnIWeebFIDTbHtRz5I09ZAYACGPFu76Pya8UnbtsyL_wKbC7beT2KnDvdP0ht6JHK-0Vmpjb1GTN9f2Hcj8mygJzwiGPgNyF2bbK8nk2FIiMKsgCADX5ROMH-vI-zXOJxoaIN5xwg-EE0LkvkmWlWzWF0j_GKcQilvsBIR69MmOpxxqys-LsJVCtXFswA9IAY_6K60H9INoH4bVnY7AXMQ6xs296kimqb1hpwKypog4L5hGyqy2aGuJt47iUN-Lw7_b6SBjee37EcFXqQaSUQFa32BKQN67MnUiCnATqtZKrdRnU_zAQ1oNYpos5utx9-xb2Pc1kR4rc_HWUHAleZa4ZO4z8Nru4Fv-YOEaJMsZG0ZQ");
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

