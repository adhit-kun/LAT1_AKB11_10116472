package com.ayaya.lat1_akb11_10116472;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
        NIM     : 10116472
        Nama    : Adhitya Kuncoro Jatti
        Kelas   : IF-11 / AKB-11
        Tanggal : 06-April-2019
*/

public class MainActivity extends AppCompatActivity {

    Button btn_mulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getBooleanExtra("EXIT", false)){
            finish();
        }
        btn_mulai = findViewById(R.id.btnMulai);
        btn_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);
            }
        });
    }
}
