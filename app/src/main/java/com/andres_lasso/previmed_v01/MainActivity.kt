package com.andres_lasso.previmed_v01

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.andres_lasso.previmed_v01.ui.theme.Previmed_V01Theme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botones y navegación
        findViewById<Button>(R.id.btn_estado_civil).setOnClickListener {
            startActivity(Intent(this, EstadoCivil::class.java))
        }

        findViewById<Button>(R.id.btn_estado_civil_ver).setOnClickListener {
            startActivity(Intent(this, EstadoCivilVer::class.java))
        }

        findViewById<Button>(R.id.btn_forma_pagos).setOnClickListener {
            startActivity(Intent(this, FormaPagos::class.java))
        }

        findViewById<Button>(R.id.btn_forma_pagos_ver).setOnClickListener {
            startActivity(Intent(this, FormaPagosVer::class.java))
        }

        findViewById<Button>(R.id.btn_roles).setOnClickListener {
            startActivity(Intent(this, Roles::class.java))
        }

        findViewById<Button>(R.id.btn_roles_ver).setOnClickListener {
            startActivity(Intent(this, RolesVer::class.java))
        }

        findViewById<Button>(R.id.btn_tipos_documento).setOnClickListener {
            startActivity(Intent(this, TipoDocumento::class.java))
        }

        findViewById<Button>(R.id.btn_tipos_documento_ver).setOnClickListener {
            startActivity(Intent(this, TiposDocumentoVer::class.java))
        }
    }
}