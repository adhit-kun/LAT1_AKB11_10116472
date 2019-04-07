package com.ayaya.lat1_akb11_10116472;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
        NIM     : 10116472
        Nama    : Adhitya Kuncoro Jatti
        Kelas   : IF-11 / AKB-11
        Tanggal : 06-April-2019
*/

public class hai extends AppCompatActivity {

    private String NAME = "kamu";
    private String nama;
    TextView txtHai;
    Button btnHai;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hai);
        txtHai = (TextView) findViewById(R.id.txtSayhai);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(NAME);
        txtHai.setText("Beres! Sekarang " + nama + " udah bisa ngecek penggunan HP mu tiap hari buat bantu kamu ngatur waktu :)");

        btnHai = (Button) findViewById(R.id.Oke);
        btnHai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hai.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
            }
        });
    }

}