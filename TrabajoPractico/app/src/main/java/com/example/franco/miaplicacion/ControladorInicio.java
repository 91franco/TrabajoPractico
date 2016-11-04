package com.example.franco.miaplicacion;

import android.net.Uri;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.os.Handler;


import java.io.IOException;


/**
 * Created by Franco on 29/09/2016.
 */
public class ControladorInicio implements View.OnClickListener,Handler.Callback {

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
                Handler.Callback callback = this;
                Handler handler = new Handler(callback);
                MiHilo hilo = new MiHilo(handler,1);
                hilo.start();

            }

        }

        if (v.getId()==R.id.btnRegistrarse){
            Log.d("Se hizo clic","clic");
            vista.iniciarRegistro();
        }
    }

    @Override
    public boolean handleMessage(Message msg) {

        return false;
    }
}
