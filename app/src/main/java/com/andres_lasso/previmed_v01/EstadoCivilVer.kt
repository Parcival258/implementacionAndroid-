package com.andres_lasso.previmed_v01;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;

public class EstadoCivilVer extends AppCompatActivity {
    ListView listaEstadoCiviles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estado_civil_ver);
        listaEstadoCiviles = findViewById(R.id.listadoEstadoCivil);
        ArrayList<String> listaEstadosCiviles = new ArrayList<>(Arrays.asList(
                "Soltero",
                "Casado",
                "Unión Libre",
                "Divorciado",
                "Viudo"
        ));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                listaEstadosCiviles
        );

        listaEstadoCiviles.setAdapter(adapter);
    }
}