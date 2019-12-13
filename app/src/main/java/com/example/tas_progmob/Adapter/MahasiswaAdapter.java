package com.example.tas_progmob.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tas_progmob.Model.Mahasiswa;
import com.example.tas_progmob.RecyclerMahasiswaActivity;
import com.example.tas_progmob.R;
import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerMahasiswaActivity {
    private ArrayList<Mahasiswa> mhsSIArrayList;
    public MahasiswaAdapter(ArrayList<Mahasiswa> mhsSIArrayList){
        this.mhsSIArrayList = mhsSIArrayList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_card_view_mahasiswa,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNim.setText(mhsSIArrayList.get(position).getNim());
        holder.txtNama.setText(mhsSIArrayList.get(position).getNama());
        holder.txtEmail.setText(mhsSIArrayList.get(position).getEmail());
        holder.txtAlamat.setText(mhsSIArrayList.get(position).getAlamat());
        holder.ImgMhs.setImageResource(mhsSIArrayList.get(position).getImgMhs());
    }

    @Override
    public int getItemCount() { //untuk menghitung jumlah data yang ada//
        return (mhsSIArrayList != null) ?mhsSIArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNim, txtNama, txtEmail, txtAlamat;
        ImageView ImgMhs;

        public ViewHolder(View view){
            super(view);
            txtNim = view.findViewById(R.id.txtNim);
            txtNama = view.findViewById(R.id.txtNama);
            txtEmail = view.findViewById(R.id.txtEmail);
            txtAlamat = view.findViewById(R.id.txtAlamat);
            ImgMhs = view.findViewById(R.id.ImgMhs);
        }
    }
}
