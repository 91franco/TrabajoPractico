package com.example.franco.miaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CategoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);

        List<Categoria> categorias = new ArrayList<Categoria>();
        categorias.add(new Categoria("Fideos","Fideos resorte"));
        //categorias.add(new Categoria("Pan","Pan frances"));
        //categorias.add(new Categoria("Azucar","Azucar negra"));

        RecyclerView list = (RecyclerView) findViewById(R.id.rvCategoria);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        list.setLayoutManager (layoutManager);

        MiAdapter adapter = new MiAdapter(categorias);
        list.setAdapter(adapter);


        ControladorCategoria controlador = new ControladorCategoria();
        VistaCategoria vista = new VistaCategoria(this,controlador);

        controlador.setVista(vista);

    }
}
