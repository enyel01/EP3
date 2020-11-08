package com.example.ep3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class EP3_PLAY extends AppCompatActivity {
    private ArrayList<String> pedidios;
    Button agreg1, agreg2, agreg3, agreg4, atras, lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_p3__p_l_a_y);
        agreg1=(Button) findViewById(R.id.btnAgregar);
        agreg2=(Button) findViewById(R.id.btnAgregar1);
        agreg3=(Button) findViewById(R.id.btnAgregar2);
        agreg4=(Button) findViewById(R.id.btnAgregar3);
        atras=(Button) findViewById(R.id.btnRegresar);
        lista=(Button) findViewById(R.id.btnLista);
        pedidios = new ArrayList<>();
        agreg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pedidios.add("The Last of Us        S/100");
            }
        });
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