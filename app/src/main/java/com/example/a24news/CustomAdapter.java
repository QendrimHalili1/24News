package com.example.a24news;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a24news.Models.NewsHeadLines;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Optional;

public class CustomAdapter extends RecyclerView.Adapter<CostumViewHolder> {

    private Context context;
    private List<NewsHeadLines> headLines;
    private SelectListener listener;

    public CustomAdapter(Context context, List<NewsHeadLines> headLines, SelectListener listener) {
        this.context = context;
        this.headLines = headLines;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CostumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CostumViewHolder(LayoutInflater.from(context).inflate(R.layout.headline_list_items,parent,false));
    }


    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull CostumViewHolder holder,int position) {
        holder.text_title.setText(headLines.get(position).getTitle());
        holder.text_source.setText(headLines.get(position).getSource().getName());
        if(headLines.get(position).getUrlToImage()!=null)
        {
            Picasso.get().load(headLines.get(position).getUrlToImage()).into(holder.img_headline);
        }

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnNewsCilcked(headLines.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return headLines.size();
    }
}
