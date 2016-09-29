package com.example.franco.miaplicacion;

import android.util.Log;
import android.view.View;

/**
 * Created by Franco on 24/09/2016.
 */
public class ControladorNuevaCategoria implements View.OnClickListener {
    private VistaNuevaCategoria vista;

    public ControladorNuevaCategoria(){

    }

    public void setVistaNuevaCategoria(VistaNuevaCategoria v){
        this.vista =v;
    }

    @Override
    public void onClick(View v){


        if(v.getId()==R.id.btnCrearCategoria){
            vista.crearCategoria();
            Log.d("Se hizo clic","clic");

        }

    }

}
