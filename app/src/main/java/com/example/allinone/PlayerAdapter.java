package com.example.allinone;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder> {
    Context context;
    int[] posters;
    String[] genre, names;

    public  PlayerAdapter(Context context, int[] posters, String[] genre, String[] names) {
        this.context = context;
        this.posters = posters;
        this.genre = genre;
        this.names = names;
    }


    @NonNull
    @Override
    public PlayerAdapter.PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.one_item_design, parent, false);
        return new PlayerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerAdapter.PlayerViewHolder holder, int position) {
        holder.iv.setImageResource(posters[position]);
        holder.tv1.setText(names[position]);
        holder.tv2.setText(genre[position]);
    }

    @Override
    public int getItemCount() {
        return posters.length;
    }

    public class PlayerViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv;
        private TextView tv1, tv2;
        public PlayerViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.athleteImage);
            tv1 = itemView.findViewById(R.id.athleteName);
            tv2 = itemView.findViewById(R.id.athleteGenre);
        }
    }
}
