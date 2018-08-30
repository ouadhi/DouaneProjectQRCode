package com.example.mac.douaneproject;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.example.mac.douaneproject.adabter.DeclarationChamp;
import com.example.mac.douaneproject.adabter.InfoDeclAdabter;

import java.util.ArrayList;

public class DeclarationInfo extends AppCompatActivity {

    private RecyclerView recyclerView;
    private InfoDeclAdabter adapter;
    private  Declaration  declaration   ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_declaration_info);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("info");

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // get passed intent

        Intent intent  = getIntent()   ;
        declaration  =  (Declaration)intent.getSerializableExtra("object")   ;

        System.out.println(""+declaration.getArticles());

        adapter  = new InfoDeclAdabter(this , fromDeclarationToChamp())  ;
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<DeclarationChamp> fromDeclarationToChamp() {
        ArrayList<DeclarationChamp> list  =  new ArrayList<>()  ;
        list.add(new DeclarationChamp("Numero Manifest", Integer.toString(declaration.getNumManif())));
        list.add(new DeclarationChamp("Numero Group" , Short.toString(declaration.getNumGroup())));
        list.add(new DeclarationChamp("Numero Ligne" ,  Short.toString(declaration.getNumLigne())));
        list.add(new DeclarationChamp("Circuit" ,  declaration.getCircuit()))  ;
        list.add(new DeclarationChamp("Régime douanier", Short.toString(declaration.getCodeReg())) )  ;

        return  list  ;
    }
}
