package com.example.franco.miaplicacion;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Franco on 29/09/2016.
 */
public class VistaRegistrarse {
    private Activity activity;
    private Button btnReRegistrarse;
    private EditText editNombre;
    private EditText editApellido;
    private EditText editUsuario;
    private EditText editContraseña;
    private EditText editReContraseña;


    public VistaRegistrarse(Activity ac, ControladorRegistrarse controlador) {
        activity = ac;

        if (activity.getClass().getName().equals("com.example.franco.miaplicacion.RegistrarseActivity")) {
            this.btnReRegistrarse = (Button) activity.findViewById(R.id.btnReRegistrarse);
            this.btnReRegistrarse.setOnClickListener(controlador);
            this.editNombre = (EditText) activity.findViewById(R.id.editRNombre);
            this.editApellido = (EditText) activity.findViewById(R.id.editRApellido);
            this.editUsuario = (EditText) activity.findViewById(R.id.editRUsuarioEmail);
            this.editContraseña = (EditText) activity.findViewById(R.id.editRClave);
            this.editReContraseña = (EditText) activity.findViewById(R.id.editRReinClave);
        }
    }

    public void datosRegistro(){
        InicioActivity.usuario = new Usuario(this.editNombre.getText().toString(),this.editApellido.getText().toString(),
                this.editUsuario.getText().toString(),this.editContraseña.getText().toString());
        Intent i = new Intent(activity,InicioActivity.class);
        activity.startActivity(i);
    }

}
