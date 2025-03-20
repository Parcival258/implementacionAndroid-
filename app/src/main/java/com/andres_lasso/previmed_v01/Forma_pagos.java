package com.andres_lasso.previmed_v01;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Date;

public class Forma_pagos extends AppCompatActivity {
    public int id_forma_pago;
    public String tipo_pago;
    public Date created;
    public Date updated;

    public Forma_pagos(int id_forma_pago, String tipo_pago, Date created, Date updated) {
        this.id_forma_pago = id_forma_pago;
        this.tipo_pago = tipo_pago;
        this.created = created;
        this.updated = updated;

    }
    public int getId_forma_pago() {
        return id_forma_pago;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public Date getCreated() {
        return created;
    }

    public Date getUpdated() {
        return updated;
    }

    TextInputEditText txt_tipoPago;
    Button btnguardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forma_pagos);

        btnguardar = findViewById(R.id.btnguardar);
        txt_tipoPago = findViewById(R.id.txt_tipo_Pago);







    }

}