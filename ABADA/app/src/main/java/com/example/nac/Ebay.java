package com.example.nac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Ebay extends AppCompatActivity {
    private WebView ebayweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebay);

        ebayweb =(WebView) findViewById(R.id.ebayweb);
        ebayweb.setWebViewClient(new WebViewClient());
        ebayweb.loadUrl("https://www.ebay.com");

        WebSettings webSettings = ebayweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    public void voltaebay(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
