package com.example.franco.miaplicacion;

import android.util.Log;
import android.view.View;

/**
 * Created by Franco on 29/09/2016.
 */
public class ControladorInicio implements View.OnClickListener {

    private VistaInicio vista;

    public ControladorInicio(){

    }

    public void setVista(VistaInicio v){
        this.vista=v;
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnIngresar) {
            if (Usuario.recuperarUsuario() != null) {
                Log.d("Se hizo clic", "clic");
            } else {

                vista.listaCategoria();
            }

        }

        if (v.getId()==R.id.btnRegistrarse){
            Log.d("Se hizo clic","clic");
            vista.iniciarRegistro();
        }
    }
}
