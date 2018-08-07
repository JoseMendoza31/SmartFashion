package com.example.arist.smartfashion;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AddapterDatos extends RecyclerView.Adapter<AddapterDatos.ViewHolderDatos> implements View.OnClickListener{


    ArrayList<productos> listProducto;
    private View.OnClickListener listener;

    public AddapterDatos(ArrayList<productos> listProducto) {
        this.listProducto = listProducto;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
    view.setOnClickListener(this);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.etiNombre.setText(listProducto.get(position).getNombre());
        holder.etiInfo.setText(listProducto.get(position).getInf());
        holder.foto.setImageResource(listProducto.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listProducto.size();
    }


    public void setOnClickListener (View.OnClickListener listener){
        this.listener= listener;
    }

    @Override
    public void onClick(View view) {
        if (listener != null){
            listener.onClick(view);
        }
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

     TextView etiNombre, etiInfo;
     ImageView foto;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            etiNombre = (TextView) itemView.findViewById(R.id.idnombre);
            etiInfo =  (TextView) itemView.findViewById(R.id.idinf);
            foto =  (ImageView) itemView.findViewById(R.id.idimagen);

        }


    }
}
