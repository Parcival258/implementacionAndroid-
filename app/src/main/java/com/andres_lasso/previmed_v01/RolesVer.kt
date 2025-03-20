package com.andres_lasso.previmed_v01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RolesVer extends AppCompatActivity {

    Button btn_nuevo_rol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roles_ver);
        btn_nuevo_rol = findViewById(R.id.btn_nuevo_rol);
        btn_nuevo_rol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RolesVer.this, Roles.class);
                startActivity(intent);
            }
        });
    }
}