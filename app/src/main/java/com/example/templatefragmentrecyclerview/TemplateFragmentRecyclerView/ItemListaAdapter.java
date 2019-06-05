package com.example.templatefragmentrecyclerview.TemplateFragmentRecyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.templatefragmentrecyclerview.R;

import java.util.List;

/*
 * Crear una clase Adapter que extienda de RecyclerView.Adapter y sobreescribir los métodos necesarios.
*/
public class ItemListaAdapter extends RecyclerView.Adapter {

    /*
    * En el Adapter agregar los atributos necesarios: lista. Crear el constructor correspondiente.
    */

    private List<ItemLista> listaDeItems;

    public ItemListaAdapter(List<ItemLista> listaDeItems){
        this.listaDeItems = listaDeItems;
    }

    /*
     * onCreateViewHolder(...): Esta función es la encargada de inflar la vista del detalle de la lista y
     * además de crear un objeto ViewHolder utilizando esa vista.
     *    i. En este método vamos a buscar el inflador.
     *    ii. Inflar la vista.
     *    iii. Instanciar un ViewHolder del tipo que creamos anteriormente pasándole como parámetro
     *         la vista que inflamos.
     *    iv. Por último, retornamos el ViewHolder.
     *
     **/
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflador =  LayoutInflater.from(viewGroup.getContext());
        View view = inflador.inflate(R.layout.celda_item, viewGroup, false);
        ItemListaViewHolder itemListaViewHolder = new ItemListaViewHolder(view);
        return itemListaViewHolder;
    }
    /*
    * onBindViewHolder(..): Esta función es la encargada de actualizar los datos reutilizando el
    * ViewHolder que viene por parámetro (holder). Es decir, carga el ViewHolder con los datos del
    * objeto que se encuentra en la posición que me pasan por parámetro (position).
    *   i. Buscamos en la lista el ítem a través de la posición que recibe por parámetro.
    *   ii. Castear el holder que recibe por parámetro al tipo ViewHolder que creamos.
    *   iii. Pedirle al ViewHolder que haga el bind del ítem.
    */
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ItemLista unItemDeLaLista = this.listaDeItems.get(i);
        ItemListaViewHolder itemListaViewHolder = (ItemListaViewHolder) viewHolder;
        itemListaViewHolder.bindItemLista(unItemDeLaLista);
    }

    /*
    * getItemCount retorna el tamaño de la lista de Items
    */
    @Override
    public int getItemCount() {
        return this.listaDeItems.size();
    }

    /*
    * Dentro del Adapter crear una clase privada para el ViewHolder que extienda de RecyclerView.ViewHolder
    *
    * En el ViewHolder sobreescribir el constructor.
    *
    * Agregar los componentes del layout de la celda como atributos del ViewHolder, y en el constructor
    * inicializarlos con findViewById a través de la vista que recibe.
    */
    private class ItemListaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imagenItemImagenView;
        private TextView tituloItemTextView;
        private TextView descripcionItemTextView;
        private ItemLista unItemLista;

        public ItemListaViewHolder(@NonNull View itemView) {
            super(itemView);
            imagenItemImagenView = itemView.findViewById(R.id.imagenItemViewItem);
            tituloItemTextView = itemView.findViewById(R.id.tituloItemTextView);
            descripcionItemTextView = itemView.findViewById(R.id.descripcionItemTextView);

        }
        /*
        * En el ViewHolder crear un método para realizar el bind (cargar la información dentro de los componentes
        * del layout de la celda) que reciba los datos necesarios y los setee.
        * Ejemplo:
        *   public void bindTitular (Titular titular){
        *   textViewTitulo.setText(titular.getTitulo());
        *   }
        */

        public void bindItemLista(ItemLista unItemLista){
            this.unItemLista = unItemLista;
            this.tituloItemTextView.setText(this.unItemLista.getItemTitulo());
            this.descripcionItemTextView.setText(this.unItemLista.getItemDescripcion());
            this.imagenItemImagenView.setImageResource(this.unItemLista.getItemImagen());
        }
    }
}
