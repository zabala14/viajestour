package com.viajesTour.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inicio_sesion extends AppCompatActivity {


    Button btn_back_to_home;
    Button btn_inicio_Sesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        btn_back_to_home = findViewById(R.id.btn_back_to_home);
        btn_inicio_Sesion = findViewById(R.id.btn_inicio_Sesion);

        btn_back_to_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBtn_back_to_home();
            }
        });

        btn_inicio_Sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIniciarSesion();
            }
        });

    }

    public void setBtn_back_to_home(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

    public void btnIniciarSesion(){
        Intent intent2 = new Intent(this, dashboard.class);
        startActivity(intent2);
    }


}