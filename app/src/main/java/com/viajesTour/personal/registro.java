package com.viajesTour.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registro extends AppCompatActivity {

    Button btnVolverHome;
    Button btn_registrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnVolverHome = findViewById(R.id.btn_volver_home);
        btn_registrar = findViewById(R.id.btn_registrar);

        btnVolverHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBtnVolverHome();
            }
        });

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBtnRegistrar();
            }
        });

    }

    public void setBtnVolverHome(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

    public void setBtnRegistrar(){
        Intent intent2 = new Intent(this, inicio_sesion.class);
        startActivity(intent2);
    }


}