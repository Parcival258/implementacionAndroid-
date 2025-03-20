package com.andres_lasso.previmed_v01

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RolesVer : AppCompatActivity() {
    var btn_nuevo_rol: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roles_ver)
        btn_nuevo_rol = findViewById(R.id.btn_nuevo_rol)
        btn_nuevo_rol.setOnClickListener(View.OnClickListener {
            val intent = Intent(
                this@RolesVer,
                Roles::class.java
            )
            startActivity(intent)
        })
    }
}