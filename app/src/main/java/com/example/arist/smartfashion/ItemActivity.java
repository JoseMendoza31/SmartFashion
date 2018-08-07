package com.example.arist.smartfashion;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;

import java.util.ArrayList;

import android.R.*;
import android.R.array;
import android.R.array;
import android.widget.Toast;


public class ItemActivity extends AppCompatActivity {

    ArrayList<productos> listProducto;
    RecyclerView recyclerProducto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);


        recyclerProducto = (  RecyclerView) findViewById(R.id.Recyclerid);
        recyclerProducto.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        //recyclerProducto.setLayoutManager(new GridLayoutManager(this,2));
        listProducto = new ArrayList<productos>();

        llenarProductos();


        AddapterDatos adapter = new AddapterDatos(listProducto);
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"SU SELECCION HA SIDO:"+listProducto.get(recyclerProducto.getChildAdapterPosition(view))
                        .getNombre(),Toast.LENGTH_SHORT).show();

            }
        });
        recyclerProducto.setAdapter(adapter);
    }

    private void llenarProductos() {
        listProducto.add(new productos("ESMALTE"," ", R.drawable.esmalte ));
        listProducto.add(new productos("BASE"," ", R.drawable.base ));
        listProducto.add(new productos("RUBOR"," ", R.drawable.rubor ));
        listProducto.add(new productos("DELINEADOR"," ", R.drawable.delineador ));
        listProducto.add(new productos("SOMBRE"," ", R.drawable.sobras ));
        listProducto.add(new productos("LIPTICK"," ", R.drawable.lipstick ));
    }
}
