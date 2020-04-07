package com.example.nac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MercadoLivre extends AppCompatActivity {

    private WebView mercadolivreweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercado_livre);

        mercadolivreweb = (WebView) findViewById(R.id.mercadolivreweb);
        mercadolivreweb.setWebViewClient(new WebViewClient());
        mercadolivreweb.loadUrl("https://www.mercadolivre.com.br");

        WebSettings webSettings = mercadolivreweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    public void voltamercadolivre(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
