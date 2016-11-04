package com.example.franco.miaplicacion;

/**
 * Created by alumno on 27/10/2016.
 */

import android.net.Uri;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conexion  {

    public byte [] obtenerInformacion (String urlString, String apiKey) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("GET");
        urlConnection.setRequestProperty("AUTHORIZATION", apiKey);
        urlConnection.connect();

        int response = urlConnection.getResponseCode();
        Log.d("Http", "Response code: " + response);
        if(response==200){
            InputStream is = urlConnection.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte [] buffer = new byte[1024];
            int length = 0;
            while ((length = is.read(buffer)) != -1){
                baos.write(buffer,0,length);
            }
            is.close();
            return baos.toByteArray();
        }
        else
            throw new IOException();
    }

    public byte [] enviarInformacion (String urlString,Uri.Builder postParams,String pedido,String apiKey) throws  IOException {
        URL url = new URL(urlString);
        Log.d("url", urlString);
        Log.d("post",postParams.toString());
        Log.d("metodo", pedido);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod(pedido);
        urlConnection.setRequestProperty("AUTHORIZATION", apiKey);
        urlConnection.setDoOutput(true);


        String query = postParams.build().getEncodedQuery();
        OutputStream os = urlConnection.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new
                OutputStreamWriter(os,"UTF-8"));
        writer.write(query);
        writer.flush();
        writer.close();
        os.close();

        int response = urlConnection.getResponseCode();
        Log.d("response",""+response);
        if(response==200) {
            InputStream is = urlConnection.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte [] buffer = new byte[1024];
            int length = 0;
            while ((length = is.read(buffer)) != -1){
                baos.write(buffer,0,length);
            }
            is.close();
            return baos.toByteArray();
        }
        else

            throw new IOException();


    }

}
