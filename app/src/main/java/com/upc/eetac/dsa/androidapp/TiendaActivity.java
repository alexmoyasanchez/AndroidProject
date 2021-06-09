package com.upc.eetac.dsa.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TiendaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda);
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

    public void comprarEscudoMadera (View view) {
    }

    public void comprarEscudoPlata (View view) {

    }

    public void comprarEscudoOro (View view) {

    }

    public void comprarFlechaPlata (View view) {

    }

    public void comprarFlechaOro (View view) {

    }

    public void comprarManzana (View view) {

    }

    public void comprarPocimaAzul (View view) {

    }

    public void comprarPocimaRoja (View view) {

    }
}