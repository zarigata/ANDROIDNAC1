package com.example.nac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webmottors extends AppCompatActivity {
    private WebView webmottorsweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webmottors);

        webmottorsweb = (WebView) findViewById(R.id.webmottorsweb);
        webmottorsweb.setWebViewClient(new WebViewClient());
        webmottorsweb.loadUrl("https://www.webmotors.com.br");

        WebSettings webSettings = webmottorsweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    public void voltawebmottors(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
