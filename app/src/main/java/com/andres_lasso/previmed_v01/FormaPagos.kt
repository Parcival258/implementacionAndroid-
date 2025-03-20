package com.andres_lasso.previmed_v01

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import java.util.Date

class FormaPagos(
    var id_forma_pago: Int,
    var tipo_pago: String,
    var created: Date,
    var updated: Date
) :
    AppCompatActivity() {
    var txt_tipoPago: TextInputEditText? = null
    var btnguardar: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forma_pagos)

        btnguardar = findViewById(R.id.btnguardar)
        txt_tipoPago = findViewById(R.id.txt_tipo_Pago)
    }
}