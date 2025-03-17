package com.andres_lasso.previmed_v01;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Roles extends AppCompatActivity {
    private int id_rol;
    public String nombre;
    private String created;
    private String updated;

    public Roles() {}
    public Roles(int id_rol, String nombre, String created, String updated) {
        this.id_rol = id_rol;
        this.nombre = nombre;
        this.created = created;
        this.updated = updated;
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

    public String getCreated() {
        return created;
    }

    public String getUpdated() {
        return updated;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roles);

    }
}