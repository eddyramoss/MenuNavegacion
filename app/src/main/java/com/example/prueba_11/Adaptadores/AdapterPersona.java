package com.example.prueba_11.Adaptadores;

import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prueba_11.Entidades.Persona;
import com.example.prueba_11.R;

import java.util.ArrayList;

public class AdapterPersona extends RecyclerView.Adapter<AdapterPersona.ViewHolder> implements View.OnClickListener{

    LayoutInflater intflater;
    ArrayList<Persona> model;

    private View.OnClickListener listener;

    public AdapterPersona(Context context, ArrayList<Persona> model){
        this.intflater=LayoutInflater.from(context);
        this.model = model;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = intflater.inflate(R.layout.lista_palabras, parent,false);

        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    public void  setOnClickListener(View.OnClickListener listener){
        this.listener=listener;


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

            String nombre= model.get(position).getNombre();
            String fechaElavoracion=model.get(position).getFechaElavoracion();
            int imagen= model.get(position).getImagenid();
            holder.nombres.setText(nombre);
            holder.fechaElavoracion.setText(fechaElavoracion);
            holder.imagen.setImageResource(imagen);

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View view) {

        if (listener!=null){
            listener.onClick(view);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nombres, fechaElavoracion;
        ImageView imagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombres=itemView.findViewById(R.id.nombre_palabra);
            fechaElavoracion=itemView.findViewById(R.id.fecha_elavoracion);
            imagen = itemView.findViewById(R.id.imagen_palabra);
        }
    }

}
