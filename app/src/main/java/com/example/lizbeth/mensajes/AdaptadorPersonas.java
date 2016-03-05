package com.example.lizbeth.mensajes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


/**
 * Created by Victor on 01/03/2016.
 */
public class AdaptadorPersonas extends RecyclerView.Adapter<AdaptadorPersonas.ViewHolder>  {
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_2, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //OBJETO DE TIPO PERSONA PARA OBTENER LOS DATOS POR PERSONA
        Personas item = Personas.PERSONAS_LIST.get(position);

        //SET DATA A LOS VIEWS CORRESPONDIENTES
        holder.nombre.setText(item.getNombre_Persona());
        holder.descripcion.setText(item.getDescripcion_Persona());

        Glide.with(holder.itemView.getContext())
                .load(item.getImg_persona())
                .centerCrop()
                .crossFade()
                .into(holder.foto);
    }

    @Override
    public int getItemCount() {
        return Personas.PERSONAS_LIST.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // DECLARACION DE VARIABLES DE UN ITEM
        public TextView nombre;
        public TextView descripcion;
        public ImageView foto;


        public ViewHolder(View v) {
            super(v);
            //INFLAR VIEWS CON IDS
            nombre = (TextView) v.findViewById(R.id.Txtnombre_persona2);
            descripcion = (TextView) v.findViewById(R.id.Txt_descrip_persona2);
            foto = (ImageView) v.findViewById(R.id.img_persona2);
        }
    }
}
