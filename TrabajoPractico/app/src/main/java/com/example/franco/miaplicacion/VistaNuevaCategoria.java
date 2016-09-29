package com.example.franco.miaplicacion;


import android.content.Intent;
import android.widget.Button;
import android.app.Activity;
import android.widget.EditText;


/**
 * Created by Franco on 24/09/2016.
 */
public class VistaNuevaCategoria {
    private Button btnCrearCategoria;
    private Activity activity;
    public VistaNuevaCategoria(Activity ac, ControladorNuevaCategoria controladorNuevaCategoria){
      activity = ac;

      if (activity.getClass().getName().equals("com.example.franco.miaplicacion.NuevaCategoriaActivity")) {
            this.btnCrearCategoria=(Button) activity.findViewById(R.id.btnCrearCategoria);
            this.btnCrearCategoria.setOnClickListener(controladorNuevaCategoria);

      }
    }

    public void crearCategoria(){
        Intent i = new Intent(activity,CategoriaActivity.class);
        activity.startActivity(i);
    }
    
}
