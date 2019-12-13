package com.example.tas_progmob;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import com.example.tas_progmob.Adapter.MahasiswaAdapter;
import com.example.tas_progmob.Model.Mahasiswa;

import java.util.ArrayList;

public class RecyclerMahasiswaActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter MahasiswaAdapter;
    private ArrayList<Mahasiswa> mhsSIArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_mahasiswa);
        Button resetButton = (Button) findViewById(R.id.BtnSimpan);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(RecyclerMahasiswaActivity.this);

                builder.setMessage("Apakah anda yakin untuk mereset nilai prototype?")
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(RecyclerMahasiswaActivity.this, "Tidak jadi reset", Toast.LENGTH_SHORT).show();
                            }
                        })

                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(RecyclerMahasiswaActivity.this,MenuAdmin.class);
                                startActivity(i);
                            }
                        });

                AlertDialog dialog = builder.create();
                dialog.show();
            }

        });

        addData();

        recyclerView = findViewById(R.id.rvDataMhs);
        MahasiswaAdapter = new MahasiswaAdapter()Adapter(mhsSIArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(RecyclerMahasiswaActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(MahasiswaAdapter);
    }
    private  void addData(){
        mhsSIArrayList = new ArrayList<>();
            mhsSIArrayList.add(new Mahasiswa("72170157","Frizk F.Nainggolan",
                "jl.Magelang km.5 Yogyakarta","freezz@gmail.com",R.drawable.ic_launcher_background));
        mhsSIArrayList.add(new Mahasiswa("72170101","Cynthia Kumalasari",
                "jl.Malioboro Yogyakarta","cyntia.kumalasari@gmail.com",R.drawable.ic_launcher_background));
        mhsSIArrayList.add(new Mahasiswa("72170149","Ivan Bernov",
                "jl.Cendrawasih No.7 Yogyakerta","ivanbernov76@gmail.com",R.drawable.ic_launcher_background));
        mhsSIArrayList.add(new Mahasiswa("72170117","Daniel Surya Nugraha",
                "jl.Wates KM.20 Yogyakarta","daniel.surya12@gmail.com",R.drawable.ic_launcher_background));
    }

}

    }
}
