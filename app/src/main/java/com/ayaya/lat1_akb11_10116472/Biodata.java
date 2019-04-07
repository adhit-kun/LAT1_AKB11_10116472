package com.ayaya.lat1_akb11_10116472;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

/*
        NIM     : 10116472
        Nama    : Adhitya Kuncoro Jatti
        Kelas   : IF-11 / AKB-11
        Tanggal : 06-April-2019
*/

public class Biodata extends AppCompatActivity {


    EditText edt_Nama, edt_Umur;
    Button btnNext;

    private String KEY_NAME = "kamu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

    }
}
