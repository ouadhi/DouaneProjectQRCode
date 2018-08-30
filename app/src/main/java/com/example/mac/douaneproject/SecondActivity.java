package com.example.mac.douaneproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.btn_camera)Button camera_button;
    @BindView(R.id.btn_formulaire)Button formulaire_button ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);


        camera_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(SecondActivity.this , Camera.class)  ;
                startActivity(intent);

            }
        });

        formulaire_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intent  =  new Intent(SecondActivity.this ,  Formulaire.class) ;
                startActivity(intent);

            }
        });
    }



}
