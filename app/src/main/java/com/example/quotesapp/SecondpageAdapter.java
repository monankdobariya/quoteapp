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

public class SecondpageAdapter extends RecyclerView.Adapter<SecondpageAdapter.MyviewHolder> {
    Context mainActivity2;
    ArrayList<Modalclass2> detail;
    QuotesInterface quotesInterface;


    public SecondpageAdapter(MainActivity2 mainActivity2, ArrayList<Modalclass2> detail, QuotesInterface quotesInterface) {
        this.mainActivity2 = mainActivity2;
        this.detail = detail;
        this.quotesInterface=quotesInterface;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mainActivity2).inflate(R.layout.quote_desing_item_file, parent, false);
        MyviewHolder m = new MyviewHolder(view);

        return m;
    }

    @SuppressWarnings("unused")
    @Override
    public void onBindViewHolder(@NonNull SecondpageAdapter.MyviewHolder holder, @SuppressLint("RecyclerView") int position) {
        int p = position;
        holder.txtname1.setText(detail.get(position).quote);
        holder.imgshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                quotesInterface.Clickshare(detail.get(p).quote);
            }
        });
        holder.imgcopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               quotesInterface.Clickcpy(detail.get(p).quote);
            }
        });


    }

    @Override
    public int getItemCount() {
        return detail.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        TextView txtname1;
        ImageView imgcopy, imgshare;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            txtname1 = itemView.findViewById(R.id.txtname1);
            imgcopy = itemView.findViewById(R.id.imgcopy);
            imgshare = itemView.findViewById(R.id.imgshare);
        }
    }
}
