package com.example.prueba_11.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prueba_11.Adaptadores.AdapterPersona;
import com.example.prueba_11.Entidades.Persona;
import com.example.prueba_11.R;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    AdapterPersona adapterPersona;
    RecyclerView recyclerViewPersonas;
    ArrayList<Persona> listaPersona;


    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        recyclerViewPersonas = view.findViewById(R.id.reciclerView);
        listaPersona = new ArrayList<>();

        cargarLista();

            mostrarData();
            return view;



    }

    private void cargarLista() {
        listaPersona.add(new Persona("Cortesia","2200-02-9",R.drawable.cortesia));
        listaPersona.add(new Persona("Claridad","2200-02-9",R.drawable.cortesia));
        listaPersona.add(new Persona("Fondo","2200-02-9",R.drawable.cortesia));
        listaPersona.add(new Persona("Forma","2200-02-9",R.drawable.cortesia));
        listaPersona.add(new Persona("Integridad","2200-02-9",R.drawable.cortesia));
        listaPersona.add(new Persona("Membrete","2200-02-9",R.drawable.cortesia));

    }
    public void mostrarData(){
        recyclerViewPersonas.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPersona = new AdapterPersona(getContext(),listaPersona);
        recyclerViewPersonas.setAdapter(adapterPersona);

    }
}