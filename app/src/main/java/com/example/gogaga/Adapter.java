package com.example.gogaga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>  {

    ArrayList<Author> imageLists;
    Context context;

            public Adapter(ArrayList<Author> imageLists, Context context) {
                this.imageLists = imageLists;
                this.context = context;
            }
            @NonNull
            @Override
            public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_xml,parent,false);
                return new ViewHolder(view);
            }

            @Override
            public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
               Author imageList=imageLists.get(position);
                holder.tvname.setText(imageList.getName());
                Glide.with(context)
                        .load(imageList.getImageurl())
                        .into(holder.img);

            }

            @Override
            public int getItemCount() {
                return imageLists.size();
            }

            public class ViewHolder extends RecyclerView.ViewHolder
            {
                private TextView tvname;
                private ImageView img;
                public ViewHolder(@NonNull View itemView) {
                    super(itemView);
                    tvname = itemView.findViewById(R.id.txt_name);
                    img = itemView.findViewById(R.id.image_view);
                }



            }
}



