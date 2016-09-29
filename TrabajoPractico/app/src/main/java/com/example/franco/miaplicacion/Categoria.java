package com.example.franco.miaplicacion;

import android.widget.ImageView;

/**
 * Created by Franco on 25/09/2016.
 */
public class Categoria {
    private String nombre;
    private String descripcion;
    private ImageView imagen;

    public Categoria(String nombre,String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    public void setImagen(ImageView imagen){
        this.imagen=imagen;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public ImageView getImagen(){
        return this.imagen;
    }


}
