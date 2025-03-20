package com.andres_lasso.previmed_v01

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class Roles : AppCompatActivity {
    var id_rol: Int = 0
        private set
    var nombre: String? = null

    constructor()
    constructor(id_rol: Int, nombre: String?) {
        this.id_rol = id_rol
        this.nombre = nombre
    }

    var txt_nombre_rol: TextInputEditText? = null
    var btn_agregar_rol: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roles)
        txt_nombre_rol = findViewById(R.id.txt_nombre_rol)
        btn_agregar_rol = findViewById(R.id.btn_agregar_rol)
    }
}