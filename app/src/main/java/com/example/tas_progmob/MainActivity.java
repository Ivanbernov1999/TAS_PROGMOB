package com.example.tas_progmob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nama, nomor, email, alamat, gelar, http;
    Button simpan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.etxNama);
        nomor = (EditText) findViewById(R.id.etxNomor);
        email = (EditText) findViewById(R.id.etxEmail);
        alamat = (EditText) findViewById(R.id.etxAlamat);
        gelar = (EditText) findViewById(R.id.etxGelar);
        http = (EditText) findViewById(R.id.etxHttp);
        simpan = (Button) findViewById(R.id.btnSimpan);

        simpan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (nama.getText().toString().length()==0) {
                    //Jika Form Nama belum diisi
                    nama.setError("Silahkan Mengisi Nama Dosen");
                }else if (nomor.getText().toString().length()==0){
                    nomor.setError("Nomor Diperlukan");
                }else if (email.getText().toString().length()==0) {
                    email.setError("Email Diperlukan");
                }else if(alamat.getText().toString().length()==0) {
                    alamat.setError("Jangan DiKosongkan");
                }else if (gelar.getText().toString().length()==0){
                    gelar.setError("Jangan Dikosongkan");
                }else if (http.getText().toString().length()==0){
                    http.setError("Http Wajib Di Isi");

                }else{
                    Toast.makeText(getApplicationContext(), "Penyimpanan Berhasil",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
