package com.example.franco.miaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NuevaCategoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_categoria);

        ControladorNuevaCategoria controladorNuevaCategoria = new ControladorNuevaCategoria();
        VistaNuevaCategoria vistaNuevaCategoria = new VistaNuevaCategoria(this, controladorNuevaCategoria);

        controladorNuevaCategoria.setVistaNuevaCategoria(vistaNuevaCategoria);
    }
}
