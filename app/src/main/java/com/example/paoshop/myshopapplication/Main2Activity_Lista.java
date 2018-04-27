package com.example.paoshop.myshopapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import modelos.Articulo;
import modelos.Persona;

public class Main2Activity_Lista extends AppCompatActivity {

    Persona usuario;
    ListView listaArt;
    ArrayAdapter<Articulo> adapter;
    Articulo []datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2__lista);
        usuario = (Persona) getIntent().getExtras().getSerializable("idUsuarioLogin");
        listaArt = (ListView) findViewById(R.id.listViewArticulos);
        cargarDatos();
        adapter = new ArrayAdapter<Articulo>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, datos);
        listaArt.setAdapter(adapter);

        listaArt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Articulo articul = (Articulo) datos[position];
                Intent intent = new Intent(getApplicationContext(), Main3Activity_ComprarPro.class);
                intent.putExtra("idArticulo", articul );
                intent.putExtra("idUsuarioLogin", usuario);
                startActivity(intent);
            }
        });
    }

    public void cargarDatos(){
        datos = new Articulo[]{ new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150),
                new Articulo("Sony Experia XY", 895.45, "Celular XYZ", 150)

        };
    }
}
