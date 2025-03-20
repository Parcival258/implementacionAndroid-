package com.andres_lasso.previmed_v01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FormaPagosVer extends AppCompatActivity {

    Button btnpago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forma_pagos_ver);
        btnpago = findViewById(R.id.btnpago);
        btnpago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormaPagosVer.this, FormaPagos.class);
                startActivity(intent);
            }
        });
    }
}
