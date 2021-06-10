package com.upc.eetac.dsa.androidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.util.List;

import models.User;
import models.Object;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TiendaActivity extends AppCompatActivity {


    EditText monedas;
    ProgressBar progressBar;
    MyAdapterTienda myAdapterTienda;
    RecyclerView recyclerView;
    List<Object> objects;

    public static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda);
        monedas = findViewById(R.id.monedasDisponiblesTienda);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        context = getApplicationContext();
        getMonedas();
        getObjetos();
    }

    public void getMonedas()
    {
        SharedPreferences preferences = getSharedPreferences("Credenciales", Context.MODE_PRIVATE);
        String user = preferences.getString("user","No existe info");
        Call<User> call = ClientAPI.getUserService().getUser(user);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.code() == 201) {

                    monedas.setText(response.body().getMonedas());
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
    }

    public void getObjetos()
    {
        Call<List<Object>> call = ClientAPI.getUserService().getObjetosTienda();
        call.enqueue(new Callback<List<Object>>() {
            @Override
            public void onResponse(Call<List<Object>> call, Response<List<Object>> response) {
                if(response.code() == 200)
                {
                    objects = response.body();
                    progressBar.setVisibility(View.INVISIBLE);
                    if(myAdapterTienda == null){
                        MyObjectsRecyclerViewAdapter(objects);
                    }else{
                        myAdapterTienda = null;
                        MyObjectsRecyclerViewAdapter(objects);
                    }
                }
            }
            @Override
            public void onFailure(Call<List<Object>> call, Throwable t) {

            }
        });
    }

    private void MyObjectsRecyclerViewAdapter(List<Object> objects){
        myAdapterTienda = new MyAdapterTienda(objects);
        recyclerView.setAdapter(myAdapterTienda);
        myAdapterTienda.SetOnItemClickListener(new MyAdapterTienda.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                //TODO NEED TO IMPLEMENT PLAYER STATS DETAIL ACTIVITY
                LaunchObjectDetailPopup(position);
            }
        });
    }
    private void LaunchObjectDetailPopup(int position){
        //Start a new activity with the detailed data of the Museum
        Log.d("Museum Detail Activity","Detail of the Museum PopUp");
        Intent intent = new Intent(TiendaActivity.this ,DetalleObjetoActivity.class);
        intent.putExtra("Element", String.valueOf(objects.get(position)));
        startActivityForResult(intent,2);
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

