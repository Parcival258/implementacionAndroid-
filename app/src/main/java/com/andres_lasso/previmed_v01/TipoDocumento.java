package com.andres_lasso.previmed_v01;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TipoDocumento{
    public int id;
    public String tipo;

    public  TipoDocumento(){

    }


    public TipoDocumento(String tipo, int id){
        this.tipo = tipo;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



}