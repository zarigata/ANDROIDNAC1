package com.example.nac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class netshoes extends AppCompatActivity {
    private WebView netshoesweb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netshoes);

        netshoesweb = (WebView) findViewById(R.id.netshoesweb);
        netshoesweb.setWebViewClient(new WebViewClient());
        netshoesweb.loadUrl("https://www.netshoes.com.br");

        WebSettings webSettings = netshoesweb.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
    public void voltanetshoes(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
