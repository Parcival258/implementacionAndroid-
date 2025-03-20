package com.andres_lasso.previmed_v01

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FormaPagosVer : AppCompatActivity() {
    var btnpago: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forma_pagos_ver)
        btnpago = findViewById(R.id.btnpago)
        btnpago.setOnClickListener(View.OnClickListener {
            val intent = Intent(
                this@FormaPagosVer,
                FormaPagos::class.java
            )
            startActivity(intent)
        })
    }
}
