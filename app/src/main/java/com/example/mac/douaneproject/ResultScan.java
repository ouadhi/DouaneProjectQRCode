package com.example.mac.douaneproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;

public class ResultScan extends AppCompatActivity {

    private TextView num_declaration ;
    private TextView date_declaration ;
    private TextView code_bureau ;
    private TextView nb_artiles  ;
    private LinearLayout button_info  ;
    private LinearLayout button_operateur  ;
    private LinearLayout _button_articles ;

    private Declaration declaration = null ;
    private final static String TAG = "TestActivity";

    public  final static String SER_KEY = "com.example.mac.douaneproject.ser";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_scan);

        num_declaration  = (TextView)findViewById(R.id.num_declaration)  ;
        date_declaration = (TextView)findViewById(R.id.datedeclaration)  ;
        code_bureau =  (TextView)findViewById(R.id.code_bureau)  ;
        nb_artiles  = (TextView)findViewById(R.id.nbarticle)  ;
        button_info  = (LinearLayout)findViewById(R.id.button_info)  ;
        button_operateur = (LinearLayout)findViewById(R.id.operateurbutton)  ;
        _button_articles = (LinearLayout)findViewById(R.id._button_articles)  ;


        fetch();

        button_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               declaration_information();
            }
        });

        button_operateur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operateurInformation();
            }
        });

        _button_articles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 articles_information();
            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "On Start .....");
        fetch();
    }

    private void  fetch () {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        // prepare the Request
        JsonObjectRequest getRequest = new JsonObjectRequest(Request.Method.GET,"http://192.168.42.116:8181/getOneDeclaration/1/1704/2018" ,
                new Response.Listener<JSONObject>()
                {
                    @Override
                    public void onResponse(JSONObject response) {
                        Gson gson =  new Gson()  ;
                        declaration  = (Declaration)  gson.fromJson(response.toString() , Declaration.class)  ;
                        try {
                           num_declaration.setText("N° Declaration :"+declaration.getId().getNumDecl());
                           code_bureau.setText("Code bureau "+declaration.getId().getCodeBur());
                           nb_artiles.setText("Articles :"+declaration.getArticles());

                            String newstring = new SimpleDateFormat("yyyy-MM-dd").format(declaration.getId().getAnDecl());
                            date_declaration.setText("Date Declaration :"+newstring);


                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );
        queue.add(getRequest);
    }

    private void declaration_information () {

        Intent  intent =  new Intent(this ,  DeclarationInfo.class) ;
        intent.putExtra("object" , declaration)  ;
        startActivity(intent);
    }

    private void operateurInformation ()  {
        Intent  intent =  new Intent(this ,  Operateur.class) ;
        intent.putExtra("object" , declaration)  ;
        startActivity(intent);
    }


    private void  articles_information   ()  {
        Intent  intent =  new Intent(this ,  Articles.class) ;
        // intent.putExtra("object" , declaration)  ;
        startActivity(intent);
    }


}
