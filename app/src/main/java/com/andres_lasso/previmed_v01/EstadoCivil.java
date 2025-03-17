package com.andres_lasso.previmed_v01;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EstadoCivil extends AppCompatActivity {

    public int idestado_civil;
    public String nombre_estado;

    public EstadoCivil() {
    }

    public EstadoCivil(String nombre) {
        this.nombre_estado = nombre;
    }

    public String getNombre_estado() {
        return nombre_estado;
    }

    public void setNombre_estado(String nombre_estado) {
        this.nombre_estado = nombre_estado;
    }

    public int getIdestado_civil() {
        return idestado_civil;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estado_civil);

    }
}