package com.upc.eetac.dsa.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InventarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventario);
    }

    public void escudoMadera(View view)
    {
        Intent intent = new Intent(this,EscudoMaderaActivity.class);
        startActivity(intent);
    }
    public void escudoPlata(View view)
    {
        Intent intent = new Intent(this,EscudoPlataActivity.class);
        startActivity(intent);
    }
    public void escudoOro(View view)
    {
        Intent intent = new Intent(this,EscudoOroActivity.class);
        startActivity(intent);
    }
    public void flechaMadera(View view)
    {
        Intent intent = new Intent(this,FlechaMaderaActivity.class);
        startActivity(intent);
    }
    public void flechaPlata(View view)
    {
        Intent intent = new Intent(this,FlechaPlataActivity.class);
        startActivity(intent);
    }
    public void flechaOro(View view)
    {
        Intent intent = new Intent(this,FlechaOroActivity.class);
        startActivity(intent);
    }
    public void manzana(View view)
    {
        Intent intent = new Intent(this,ManzanaActivity.class);
        startActivity(intent);
    }
    public void pocimaAzul(View view)
    {
        Intent intent = new Intent(this, PocimaAzulActivity.class);
        startActivity(intent);
    }
    public void pocimaRoja(View view)
    {
        Intent intent = new Intent(this, PocimaRojaActivity.class);
        startActivity(intent);
    }
}