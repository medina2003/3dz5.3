package com.example.a3dz53;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdresAdapter extends RecyclerView.Adapter<AdresViewHolder> {
    private ArrayList<String> adreses;
    public AdresAdapter(ArrayList<String> adreses){
        this.adreses=adreses;
    }

    @NonNull
    @Override
    public AdresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdresViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adres,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdresViewHolder holder, int position) {
holder.bind(adreses.get(position));
    }

    @Override
    public int getItemCount() {
        return adreses.size();
    }
}
