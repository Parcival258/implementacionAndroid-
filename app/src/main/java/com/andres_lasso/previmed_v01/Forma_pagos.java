package com.andres_lasso.previmed_v01;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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
}