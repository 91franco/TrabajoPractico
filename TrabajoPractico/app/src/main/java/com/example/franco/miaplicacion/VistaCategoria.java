package com.example.franco.miaplicacion;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;

/**
 * Created by Franco on 29/09/2016.
 */
public class VistaCategoria {
    private Activity activity;
    private Button btnAgregar;

    public VistaCategoria(Activity ac, ControladorCategoria controlador) {
        activity = ac;


        if (activity.getClass().getName().equals("com.example.franco.miaplicacion.CategoriaActivity")) {
            this.btnAgregar = (Button) activity.findViewById(R.id.btnAgregar);
            this.btnAgregar.setOnClickListener(controlador);

        }
    }

    public void crearCategoria(){
        Intent i = new Intent(activity,NuevaCategoriaActivity.class);
        activity.startActivity(i);
    }
}
