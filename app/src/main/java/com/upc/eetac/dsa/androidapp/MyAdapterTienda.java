package com.upc.eetac.dsa.androidapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import models.Object;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


import java.util.List;

public class MyAdapterTienda extends RecyclerView.Adapter<MyAdapterTienda.ViewHolder> {
    private List<Object> objects;
    private Context context;
    private OnItemClickListener mListener;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }
    public void SetOnItemClickListener(OnItemClickListener listener){
        mListener=listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView precio;
        ImageView imageView;
        public View layout;

        public ViewHolder(View itemView, OnItemClickListener listener) {
            super(itemView);
            layout=itemView;
            name = itemView.findViewById(R.id.nameObject);
            imageView = itemView.findViewById(R.id.avatarTienda);
            precio = itemView.findViewById(R.id.precio);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null)
                    {
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION)
                        {
                            listener.onItemClick(position);
                        }
                    }
                }
            });

        }
    }

    public MyAdapterTienda(List<Object> objects){
        this.objects = objects;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from( parent.getContext());
        View v = inflater.inflate(R.layout.row_recyclerview, parent, false);
        // set the view's size, margins, padding and layout parameters
        ViewHolder vh = new ViewHolder(v,mListener);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterTienda.ViewHolder holder, int position) {
        Object object = objects.get(position);
        String username = object.getNombre();
        String precio = String.valueOf(object.getCoste());
        String URL_IMG=object.getAvatar();
        Glide.with(context).load(URL_IMG).into(holder.imageView);
        holder.name.setText(username);
        holder.precio.setText(precio);
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }


}