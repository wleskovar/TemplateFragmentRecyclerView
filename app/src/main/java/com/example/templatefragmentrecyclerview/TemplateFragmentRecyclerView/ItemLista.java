package com.example.templatefragmentrecyclerview.TemplateFragmentRecyclerView;

public class ItemLista {

    private String itemTitulo;
    private String itemDescripcion;
    private Integer itemImagen;


    // constructor vacio por si hay una futura implementacion

    public ItemLista(){

    }

    // constructor donde se pasan como parametros los atributos de la clase ItemLista

    public  ItemLista(String itemTitulo, String itemDescripcion, Integer itemImagen){
        this.itemTitulo = itemTitulo;
        this.itemDescripcion = itemDescripcion;
        this.itemImagen = itemImagen;
    }

    public void setItemTitulo(String itemTitulo) {
        this.itemTitulo = itemTitulo;
    }

    public void setItemDescripcion(String itemDescripcion) {
        this.itemDescripcion = itemDescripcion;
    }

    public void setItemImagen(Integer itemImagen) {
        this.itemImagen = itemImagen;
    }

    public String getItemTitulo() {
        return itemTitulo;
    }

    public String getItemDescripcion() {
        return itemDescripcion;
    }

    public Integer getItemImagen() {
        return itemImagen;
    }
}
