package com.example.franco.miaplicacion;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;

import java.util.List;

/**
 * Created by Franco on 24/09/2016.
 */
public class ControladorNuevaCategoria implements View.OnClickListener,Handler.Callback {
    public static final int CREARCATEGORIA = 3;
    private VistaNuevaCategoria vista;

    public ControladorNuevaCategoria(){

    }

    public void setVistaNuevaCategoria(VistaNuevaCategoria v){
        this.vista =v;
    }

    @Override
    public void onClick(View v){


        if(v.getId()==R.id.btnCrearCategoria){
            if(vista.validaVacio()) {
                Handler.Callback callback = this;
                Handler handler = new Handler(callback);
                MiHilo hilo = new MiHilo(handler,CREARCATEGORIA,vista.cargarParametros());
                hilo.start();
            }else {
                Log.d("Pendiente:","Se lanzara un dialogo indicando que debe ingresar datos de registro");
            }
        }
    }

    @Override
    public boolean handleMessage(Message msg) {
        if(msg.arg1==CREARCATEGORIA) {
            CategoriaActivity.categorias = (List<Categoria>) msg.obj;
            vista.crearCategoria();
        }
        return false;
    }

}
