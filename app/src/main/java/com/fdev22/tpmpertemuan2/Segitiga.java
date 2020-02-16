package com.fdev22.tpmpertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {
    private EditText et_alas, et_tinggi;
    private Button btnhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        btnhasil = findViewById(R.id.btn_hasil);
        et_alas = findViewById(R.id.et_alas);
        et_tinggi = findViewById(R.id.et_tinggi);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String salas = et_alas.getText().toString();
                    String stinggi = et_tinggi.getText().toString();

                    double alas = Double.parseDouble(salas);
                    double tinggi = Double.parseDouble(stinggi);

                    double hasil = (alas * tinggi) / 2;

                    Intent intent = new Intent(Segitiga.this, HasilActivity.class);
                    intent.putExtra("hasil",hasil);
                    startActivity(intent);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Isian tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
