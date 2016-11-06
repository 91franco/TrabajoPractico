package com.example.franco.miaplicacion;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;


public class InicioActivity extends AppCompatActivity {
    public static String apiKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ControladorInicio controlador = new ControladorInicio();
        VistaInicio vista = new VistaInicio(this,controlador);

        controlador.setVista(vista);


    }

    static MiDialogo ingreseUsuario(){

         MiDialogo dialogo = new MiDialogo();
        dialogo.setTitulo("probando");
        dialogo.setMensaje("probando");
        return dialogo;
    }

    public void  ingreseUsuario (MiDialogo dialogo){
        dialogo.show(getSupportFragmentManager(), "dialogo");
    }


}
