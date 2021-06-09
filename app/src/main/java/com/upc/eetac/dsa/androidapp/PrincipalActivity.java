package com.upc.eetac.dsa.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

    }

    public void consultarUsuario (View view){
        Intent intent = new Intent(this, ConsultarActivity.class);
        startActivity(intent);
    }

    public void editarUsuario (View view){
        Intent intent = new Intent(this,EditarActivity.class);
        startActivity(intent);
    }

    public void tienda (View view){
        Intent intent = new Intent(this,TiendaActivity.class);
        startActivity(intent);
    }

    public void iniciarPartida (View view){
        Intent intent = new Intent(this,IniciarPartidaActivity.class);
        startActivity(intent);
    }

    public void estadisticasPartidas (View view){
        Intent intent = new Intent(this,EstadisticasActivity.class);
        startActivity(intent);
    }

    public void inventario (View view){
        Intent intent = new Intent(this,InventarioActivity.class);
        startActivity(intent);
    }

}