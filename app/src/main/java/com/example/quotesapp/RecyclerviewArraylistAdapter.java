package com.example.quotesapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerviewArraylistAdapter extends RecyclerView.Adapter<RecyclerviewArraylistAdapter.MyviewHolder> {
    Context homepageActivity;
    ArrayList<Modalclass> category;
    ReclerviewInterface myinterface;


    public RecyclerviewArraylistAdapter(HomepageActivity homepageActivity, ArrayList<Modalclass> category, ReclerviewInterface myinterface) {
        this.homepageActivity = homepageActivity;
        this.category = category;
        this.myinterface=myinterface;
    }

    @NonNull
    @Override
    public RecyclerviewArraylistAdapter.MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(homepageActivity).inflate(R.layout.recyclerview_arraylist_item_file, parent, false);
        MyviewHolder m = new MyviewHolder(view);

        return m;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewArraylistAdapter.MyviewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.txtname.setText(category.get(position).name);
        holder.img1.setImageResource(category.get(position).getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myinterface.click(category.get(position).name);
            }
        });


    }

    @Override
    public int getItemCount()
    {
        return category.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        TextView txtname;

        ImageView img1,imgshare,imgcopy;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            txtname = itemView.findViewById(R.id.txtname);
            img1 = itemView.findViewById(R.id.img1);
            imgshare=itemView.findViewById(R.id.imgshare);
            imgcopy=itemView.findViewById(R.id.imgcopy);

        }
    }
}
