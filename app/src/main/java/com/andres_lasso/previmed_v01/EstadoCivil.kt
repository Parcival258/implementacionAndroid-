package com.andres_lasso.previmed_v01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EstadoCivil extends AppCompatActivity {

    EditText textEstadoCivil;
    Button btnGuardarEstadoCivil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estado_civil);
        btnGuardarEstadoCivil = findViewById(R.id.btnGuardarEstadoCivil);
        textEstadoCivil = findViewById(R.id.textEstadoCivil);

        btnGuardarEstadoCivil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Toast.makeText(EstadoCivil.this, "Estado civil creado", Toast.LENGTH_SHORT).show();
                } catch (Exception e){
                    Toast.makeText(EstadoCivil.this, "No se pudo crear el estado civil", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}