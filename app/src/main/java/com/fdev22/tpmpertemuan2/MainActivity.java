package com.fdev22.tpmpertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_segitiga, btn_jajar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_jajar = findViewById(R.id.btn_jajar);
        btn_segitiga = findViewById(R.id.btn_segitiga);

        btn_segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Segitiga.class);
                startActivity(intent);
            }
        });

        btn_jajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Jajargenjang.class);
                startActivity(intent);
            }
        });
    }
}