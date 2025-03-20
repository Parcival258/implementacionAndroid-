package com.andres_lasso.previmed_v01;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class Roles extends AppCompatActivity {
    private int id_rol;
    public String nombre;

    public Roles() {}
    public Roles(int id_rol, String nombre) {
        this.id_rol = id_rol;
        this.nombre = nombre;
    }

    public int getId_rol() {
        return id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    TextInputEditText txt_nombre_rol;
    Button btn_agregar_rol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roles);
        txt_nombre_rol = findViewById(R.id.txt_nombre_rol);
        btn_agregar_rol = findViewById(R.id.btn_agregar_rol);

    }
}