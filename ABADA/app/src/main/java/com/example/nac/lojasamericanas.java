package com.example.nac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class lojasamericanas extends AppCompatActivity {
    private WebView lojasamericanasweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lojasamericanas);

        lojasamericanasweb = (WebView) findViewById(R.id.lojasamericanasweb);
        lojasamericanasweb.setWebViewClient(new WebViewClient());
        lojasamericanasweb.loadUrl("https://www.americanas.com.br");

        WebSettings webSettings = lojasamericanasweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    public void voltaamericanas(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
