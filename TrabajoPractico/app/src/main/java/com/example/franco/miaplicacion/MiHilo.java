package com.example.franco.miaplicacion;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

/**
 * Created by alumno on 03/11/2016.
 */
public class MiHilo extends Thread {
    Handler miHandler;
    Conexion miConexion;
    int accion;
    int event;
    public MiHilo(Handler handler, int i){
        miHandler=handler;
        accion=i;

    }

    @Override
    public void run (){

        try {
            Uri.Builder params = new Uri.Builder();
            params.appendQueryParameter("email","franco@gmail.com");
            params.appendQueryParameter("password", "franco123");

            Conexion miConexion= new Conexion();
            byte[] informacion=miConexion.enviarInformacion("http://lkdml.myq-see.com/login",params,"POST",null);


            // Para obtener el listado de categorias
            // /byte[] informacion=miConexion.obtenerInformacion("http://lkdml.myq-see.com/categorias","5cd87a6c8bd6c2fbaea3919c7671fbb2");
            String ds = new String (informacion);
            Log.d("respuesta:", ds);

            JSONObject jason = new JSONObject(ds);
            String key = jason.getString("apiKey");
            Log.d("dato:", key);

            //miView.setText("Ingresando al hilo");
        } catch (IOException e) {
            e.printStackTrace();
        }catch (JSONException e1){
            e1.printStackTrace();
        }

    }
}
