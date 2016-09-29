package com.example.franco.miaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RegistrarseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        ControladorRegistrarse controlador = new ControladorRegistrarse();
        VistaRegistrarse vista = new VistaRegistrarse(this,controlador);

        controlador.setVista(vista);
    }
}
