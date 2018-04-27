package com.example.paoshop.myshopapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import modelos.Persona;

public class MainActivity extends AppCompatActivity {

    EditText usuario;
    EditText password;
    Persona usuarioP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText)findViewById(R.id.usuario);
        password = (EditText)findViewById(R.id.password);
        Button botonIngresar = (Button)findViewById(R.id.buttonIngresar);
        Button botonInvitado = (Button)findViewById(R.id.buttonInvitado);
        usuarioP = new Persona(usuario.getText().toString(), password.getText().toString());

        botonIngresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                irPantallaListas(v, usuarioP);
            }
        });

        botonInvitado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irPantallaListas(v, new Persona());
            }
        });
    }

    public void irPantallaListas(View view, Persona user){
        Intent intent = new Intent(getApplicationContext(),Main2Activity_Lista.class);
        intent.putExtra("idUsuarioLogin", user);
        startActivity(intent);
    }
}
