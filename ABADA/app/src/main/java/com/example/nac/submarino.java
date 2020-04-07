package com.example.nac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class submarino extends AppCompatActivity {

    private WebView submarinoweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submarino);

        submarinoweb = (WebView) findViewById(R.id.submarinoweb);
        submarinoweb.setWebViewClient(new WebViewClient());
        submarinoweb.loadUrl("https://www.submarino.com.br");

        WebSettings webSettings = submarinoweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    public void voltasubmarino(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
