package com.example.paoshop.myshopapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import modelos.Articulo;
import modelos.Persona;

public class Main3Activity_ComprarPro extends AppCompatActivity {
    Articulo articulo;
    Persona usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3__comprar_pro);

        articulo = (Articulo)getIntent().getExtras().getSerializable("idArticulo");
        usuario = (Persona) getIntent().getExtras().getSerializable("idUsuarioLogin");
        ((TextView)findViewById(R.id.producto)).setText(articulo.getNombreTecnico());
        ((TextView)findViewById(R.id.descripcion)).setText(articulo.getDescripcion());
        ((TextView)findViewById(R.id.precio)).setText(String.valueOf(articulo.getPrecio()));
        ((TextView)findViewById(R.id.stock)).setText(String.valueOf(articulo.getStock()));

        Button botonComprar = (Button)findViewById(R.id.buttonComprar);

        botonComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast mensaje;
                if(usuario.getNombre().equals("")){
                    mensaje = Toast.makeText(getApplicationContext(), "No Loggeado", Toast.LENGTH_LONG);
                    mensaje.show();
                }
                else if(usuario.getNombre().equals("pao")){
                    mensaje = Toast.makeText(getApplicationContext(), "Articulo comprado", Toast.LENGTH_LONG);
                    mensaje.show();
                }else{

                }


            }
        });

    }
}
