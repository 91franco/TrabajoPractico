package com.example.franco.miaplicacion;

import android.util.Log;
import android.view.View;

/**
 * Created by Franco on 29/09/2016.
 */
public class ControladorCategoria implements View.OnClickListener {
    private VistaCategoria vista;

    public ControladorCategoria(){

    }

    public void setVista(VistaCategoria v){
        this.vista=v;
    }

    @Override
    public void onClick(View v){

        if(v.getId()==R.id.btnAgregar){
            Log.d("Se hizo clic","clic");
            vista.crearCategoria();
        }

    }

}