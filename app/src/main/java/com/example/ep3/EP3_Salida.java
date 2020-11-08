package com.example.ep3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EP3_Salida extends AppCompatActivity {
    TextView salida, monto;
    Button comprar, regresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_p3__salida);
        salida=(TextView) findViewById(R.id.txvSalida);
        monto=(TextView) findViewById(R.id.txvMonto);
        comprar=(Button) findViewById(R.id.btnComprar);
        regresar=(Button) findViewById(R.id.btnRegresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), MainActivity.class));
            }
        });
    }
}