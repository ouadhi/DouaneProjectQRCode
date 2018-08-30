package com.example.mac.douaneproject;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DataDeclaration {

    private String url  ;
    private String paramaitre  ;
    private Context context  ;
    Declaration declaration   ;

    public DataDeclaration(String url,Context context) {
        this.url = url;
        this.context = context ;
    }

    public DataDeclaration(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParamaitre() {
        return paramaitre;
    }

    public void setParamaitre(String paramaitre) {
        this.paramaitre = paramaitre;
    }



    public Declaration  getDeclaration ()  {

        System.out.println("fetch  API");
        RequestQueue queue = Volley.newRequestQueue(this.context);
        // prepare the Request
        JsonObjectRequest getRequest = new JsonObjectRequest(Request.Method.GET, url,
                new Response.Listener<JSONObject>()
                {
                    @Override
                    public void onResponse(JSONObject response) {
                        // display response
                     System.out.println(response.toString());

                        Gson gson =  new Gson()  ;
                        declaration  = (Declaration)  gson.fromJson(response.toString() , Declaration.class)  ;
                        System.out.println("--------------"+declaration.getAdrFrs());
                     }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );

// add it to the RequestQueue
        queue.add(getRequest);

        return  declaration  ;
    }


}
