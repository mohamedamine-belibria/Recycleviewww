package com.example.recyclevieww;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MVH> {
    Context c;
    String[] titre,stitre;
    Integer [] image;

    public ListAdapter(Context c, String[] titre, String[] stitre, Integer[] image) {
        this.c = c;
        this.titre = titre;
        this.stitre = stitre;
        this.image = image;
    }

    @NonNull
    @Override
    public MVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerlayout,parent,false);
        ListAdapter.MVH mvh=new ListAdapter.MVH(v);
        return mvh;

    }

    @Override
    public void onBindViewHolder(@NonNull MVH holder, int i) {
        holder.tit.setText(titre[i]);
        holder.stit.setText(stitre[i]);
        holder.img.setImageResource(image[i]);



    }

    @Override
    public int getItemCount() {
        return titre.length;
    }

    public class MVH extends RecyclerView.ViewHolder{
    TextView tit,stit;
    ImageView img;
        public MVH(@NonNull View itemView) {
            super(itemView);
            tit=itemView.findViewById(R.id.textView);
            stit=itemView.findViewById(R.id.textView);
            img=itemView.findViewById((R.id.imageView));

        }
    }
}
