package com.example.templatefragmentrecyclerview.TemplateFragmentRecyclerView;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.templatefragmentrecyclerview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        // Declarar y referenciar el RecyclerView que definimos en el XML
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);

        /*
        * Setear el LayoutManager al RecyclerView (recordar que podemos definir distintos tipos de
        * LayoutManager según la forma en la cual queremos mostrar nuestra lista.)
        */

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL, false);

        /*
        * Setear el LayoutManager que hayamos elegido al RecyclerView referenciado en el paso 1:
        * recyclerView.setLayoutManager(layoutManager);
        */
        recyclerView.setLayoutManager(linearLayoutManager);


        // Creo la lista que tiene los items.
        List<ItemLista> itemsDeLista = new ArrayList<>();


        // cargo la lista con los items
        itemsDeLista.add(new ItemLista("Batman","Accion",R.drawable.batman));
        itemsDeLista.add(new ItemLista("Damages", "Drama", R.drawable.damages));
        itemsDeLista.add(new ItemLista("Destroyer", "Drama", R.drawable.destroyer));
        itemsDeLista.add(new ItemLista("El Juicio", "Drama", R.drawable.eljuicio));
        itemsDeLista.add(new ItemLista("Inocente", "Drama", R.drawable.inocente));
        itemsDeLista.add(new ItemLista("Intern", "Drama", R.drawable.intern));
        itemsDeLista.add(new ItemLista("Jhon Wick 2", "Accion", R.drawable.johnwick2));
        itemsDeLista.add(new ItemLista("King Kong", "Accion", R.drawable.kong));
        itemsDeLista.add(new ItemLista("La Boda de mi Amigo", "Comedia", R.drawable.labodademi));
        itemsDeLista.add(new ItemLista("Prometo", "Drama", R.drawable.prometo));
        itemsDeLista.add(new ItemLista("Second", "Drama", R.drawable.second));
        itemsDeLista.add(new ItemLista("The Good Doctor", "Drama", R.drawable.thegoogdoctor));

        /*
        * Crear un Adapter, utilizando la clase definida anteriormente.
        * ItemListaAdapter itemListaAdapter = new ItemAdapter(itemsDeLista);
        *
        */
        ItemListaAdapter itemListaAdapter = new ItemListaAdapter(itemsDeLista);

        // Setear al RecyclerView el adapter creado.
        recyclerView.setAdapter(itemListaAdapter);

        return view;
    }

}
