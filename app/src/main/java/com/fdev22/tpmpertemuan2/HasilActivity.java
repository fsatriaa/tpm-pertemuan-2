package com.fdev22.tpmpertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        tvHasil = findViewById(R.id.tv_hasil);

        Double hasil = getIntent().getDoubleExtra("hasil", 0);

        String tHasil = ""+hasil;

        tvHasil.setText(tHasil);
    }
}
