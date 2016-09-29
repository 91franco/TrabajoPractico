package com.example.franco.miaplicacion;

import android.util.Log;
import android.view.View;

/**
 * Created by Franco on 29/09/2016.
 */
public class ControladorRegistrarse implements View.OnClickListener {

    private VistaRegistrarse vista;

    public ControladorRegistrarse(){

    }

    public void setVista(VistaRegistrarse v){
        this.vista=v;
    }

    @Override
    public void onClick(View v) {


        if (v.getId() == R.id.btnReRegistrarse) {
            Log.d("Se hizo clic", "clic");
            vista.datosRegistro();
        }
    }
}
