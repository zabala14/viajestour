package com.viajesTour.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {


    Button btnRegistro;
    Button btnInicioSesion;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnRegistro = findViewById(R.id.btn_ir_registro);

        btnInicioSesion = findViewById(R.id.btn_ir_inicio_sesion);



        btnRegistro.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                irRegistro();
            }
        });

        btnInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irInicioSesion();
            }
        });

    }

    public void irRegistro(){
        Intent intent = new Intent(this,registro.class);
        startActivity(intent);
    }

    public void irInicioSesion(){
        Intent intent2 = new Intent(this, inicio_sesion.class);
        startActivity(intent2);
    }

}