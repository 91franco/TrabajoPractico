package com.example.franco.miaplicacion;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;

/**
 * Created by Franco on 28/09/2016.
 */
public class VistaInicio {
    private Button btnIngresar;
    private Button btnRegistrarse;
    private Activity activity;

    public VistaInicio(Activity ac, ControladorInicio controlador){
        activity=ac;
        if(activity.getClass().getName().equals("com.example.franco.miaplicacion.InicioActivity")){
            this.btnIngresar=(Button) activity.findViewById(R.id.btnIngresar);
            this.btnRegistrarse=(Button) activity.findViewById(R.id.btnRegistrarse);

            this.btnIngresar.setOnClickListener(controlador);
            this.btnRegistrarse.setOnClickListener(controlador);
        }
    }

    public void iniciarRegistro(){
        Intent i = new Intent(activity,RegistrarseActivity.class);
        activity.startActivity(i);
    }

    public void listaCategoria(){
        Intent i = new Intent(activity,CategoriaActivity.class);
        activity.startActivity(i);
    }
}
