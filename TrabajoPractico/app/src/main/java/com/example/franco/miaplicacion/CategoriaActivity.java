package com.example.franco.miaplicacion;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CategoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


        List<Categoria> categorias = new ArrayList<Categoria>();
        categorias.add(new Categoria("Fideos","Fideos resorte"));
        categorias.add(new Categoria("Pan","Pan frances"));
        categorias.add(new Categoria("Azucar","Azucar negra"));

        RecyclerView list = (RecyclerView) findViewById(R.id.rvCategoria);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        list.setLayoutManager (layoutManager);

        MiAdapter adapter = new MiAdapter(categorias);
        list.setAdapter(adapter);


        ControladorCategoria controlador = new ControladorCategoria();
        VistaCategoria vista = new VistaCategoria(this,controlador);



        controlador.setVista(vista);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mimenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_cerrar_sesion:
                Intent i = new Intent(this,InicioActivity.class);
                this.startActivity(i);
                return true;
            case R.id.action_categorias:
                Intent e = new Intent(this,CategoriaActivity.class);
                this.startActivity(e);
                return true;
            case R.id.action_favoritos:
                //diseñar pagina
                return true;
            case android.R.id.home: //hago un case por si en un futuro agrego mas opciones
                Log.i("ActionBar", "Atrás!");
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
