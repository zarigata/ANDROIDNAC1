package com.example.nac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class buscape extends AppCompatActivity {
    private WebView buscapeweb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscape);

        buscapeweb = (WebView) findViewById(R.id.buscapeweb);
        buscapeweb.setWebViewClient(new WebViewClient());
        buscapeweb.loadUrl("https://www.buscape.com.br");

        WebSettings webSettings = buscapeweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    public void voltabuscape(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
