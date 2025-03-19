package com.andres_lasso.previmed_v01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import androidx.core.view.WindowInsetsCompat;

public class Forma_pagosVer extends AppCompatActivity {

    Button btnpago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forma_pagos_ver);
        btnpago = findViewById(R.id.btnpago);
        btnpago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Forma_pagosVer.this, Forma_pagos.class);
                startActivity(intent);
            }
        });
    }
}
