package com.example.ep3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EP3_Xbox extends AppCompatActivity {
    Button agreg5, agreg6, agreg7, agreg8, atras, lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_p3__xbox);
        agreg5=(Button) findViewById(R.id.btnAgregar4);
        agreg6=(Button) findViewById(R.id.btnAgregar5);
        agreg7=(Button) findViewById(R.id.btnAgregar6);
        agreg8=(Button) findViewById(R.id.btnAgregar7);
        atras=(Button) findViewById(R.id.btnRegresar);
        lista=(Button) findViewById(R.id.btnLista);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), MainActivity.class));
            }
        });
        lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), EP3_Salida.class));
            }
        });
    }
}