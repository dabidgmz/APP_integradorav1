package com.example.app_integradorav1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class register_empresa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_empresa);
        Button buttonOmitir=findViewById(R.id.buttonOmitir);
        Button buttonRegistrarEmpresa=findViewById(R.id.buttonRegistrarEmpresa);
        buttonOmitir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(register_empresa.this, Menu.class);
                startActivity(intent);
            }
        });

        buttonRegistrarEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(register_empresa.this, Menu.class);
                startActivity(intent);
            }
        });
    }
}