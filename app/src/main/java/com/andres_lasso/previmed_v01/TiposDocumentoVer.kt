package com.andres_lasso.previmed_v01;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class TiposDocumentoVer extends AppCompatActivity {

    //primero declaro lo que voy a tener en mi layout (si hay erros seguro es que hay que darle importar las clases)
    ListView listView;
    Button btnAddTipoDocumento;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tipos_documento_ver);

        //asigno los elementos a las variables declaradas (busco por id)
        listView = findViewById(R.id.listView);
        btnAddTipoDocumento = findViewById(R.id.btn_add_tipo_documento);

        //activo el boton de añadir tipo de documento

        btnAddTipoDocumento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTipoDocumento = new Intent(TiposDocumentoVer.this, TipoDocumento.class);
                startActivity(irTipoDocumento);
            }
        });

    }
}