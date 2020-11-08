package com.example.ep3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button ver1, ver2, ver3, ver4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ver1=(Button) findViewById(R.id.btnVer1);
        ver2=(Button) findViewById(R.id.btnVer2);
        ver3=(Button) findViewById(R.id.btnVer3);
        ver4=(Button) findViewById(R.id.btnVer4);
        ver1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), EP3_PLAY.class));
            }
        });
        ver2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), EP3_Xbox.class));
            }
        });
    }
}