package com.ayaya.lat1_akb11_10116472;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/*
        NIM     : 10116472
        Nama    : Adhitya Kuncoro Jatti
        Kelas   : IF-11 / AKB-11
        Tanggal : 06-April-2019
*/

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button btnMasuk, btnBeliKode;
    EditText edtKodeKeluarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView textbijak = (TextView) findViewById(R.id.idDescKetentuan);

        edtKodeKeluarga = findViewById(R.id.idEdtKodeKeluarga);

        btnMasuk = findViewById(R.id.btnMasuk);
        btnMasuk.setOnClickListener(this);

        btnBeliKode = findViewById(R.id.btnBeliKode);
        btnBeliKode.setOnClickListener(this);

        Spanned html = Html.fromHtml(
                "Dengan menekan tombol masuk berarti Anda menyetujui <b>Ketentuan Pengguna</b> dan <b>Ketentuan Pengguna</b> Data kami"
        );
        textbijak.setText(html);
    }

    @Override
    public void onClick(View v) {
        String kk = edtKodeKeluarga.getText().toString();
        boolean isEmptyFields = false;
        switch (v.getId()) {
            case R.id.btnMasuk:
                if (TextUtils.isEmpty(kk)) {
                    isEmptyFields = true;
                    Toast.makeText(getApplicationContext(), "Harap isi dengan Kode Keluarga Anda", Toast.LENGTH_LONG).show();
                } else {
                    Intent moveIntent = new Intent(Login.this, Biodata.class);
                    startActivity(moveIntent);
                }
                break;

            case R.id.btnBeliKode:
                if (TextUtils.isEmpty(kk)) {
                    isEmptyFields = true;
                    Toast.makeText(getApplicationContext(), "Harap isi dengan Kode Keluarga Anda", Toast.LENGTH_LONG).show();
                } else {
                    Intent moveIntent = new Intent(Login.this, Biodata.class);
                    startActivity(moveIntent);
                }
                break;
        }
    }
}
