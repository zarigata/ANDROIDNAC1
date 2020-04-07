package com.example.nac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ebayclick(View view)
    {
        Intent intent = new Intent(this, Ebay.class);
        startActivity(intent);
    }
    public void mercadolivreclick(View view)
    {
        Intent intent = new Intent(this, MercadoLivre.class);
        startActivity(intent);
    }
    public void buscapeclick(View view)
    {
        Intent intent = new Intent(this, buscape.class);
        startActivity(intent);
    }
    public void netshoesclick(View view)
    {
        Intent intent = new Intent(this, netshoes.class);
        startActivity(intent);
    }
    public void lojasamericanasclick(View view)
    {
        Intent intent = new Intent(this, lojasamericanas.class);
        startActivity(intent);
    }
    public void sobreclick(View view)
    {
        Intent intent = new Intent(this, Abbout.class);
        startActivity(intent);
    }
    public void webmotorsclick(View view)
    {
        Intent intent = new Intent(this,webmottors.class);
        startActivity(intent);
    }
    public void submarinoclick(View view)
    {
        Intent intent = new Intent(this,submarino.class);
        startActivity(intent);
    }
}
