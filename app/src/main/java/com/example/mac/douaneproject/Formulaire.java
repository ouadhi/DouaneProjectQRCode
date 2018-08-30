package com.example.mac.douaneproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Formulaire extends AppCompatActivity {


    @BindView(R.id._numDecl)EditText _num_declaration  ;
    @BindView(R.id._code_bureau) EditText _code_bureau ;
    @BindView(R.id._ann_decl) EditText _anne_declaration   ;
    @BindView(R.id._submit) Button _submit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulaire);
        ButterKnife.bind(this);

        _submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if ( !validate()){
                   Toast.makeText(getBaseContext(), "Vérifier bien les champs à remplir", Toast.LENGTH_LONG).show();
               }else {

                   Intent intent = new Intent(Formulaire.this, ResultScan.class )  ;
                   intent.putExtra("code" ,"code") ;
                   startActivity(intent);

               }

            }
        });

    }


    public boolean  validate  ()  {

        if (_num_declaration.getText().length()<1){
            _num_declaration.setError("Numéro de déclaration doit être non vide !!");
            return false  ;
        }

        if (_code_bureau.getText().length()<1){
            _code_bureau.setError("Code bureau doit être non vide !!");
            return false  ;
        }

        if (_anne_declaration.getText().length()<4){
            _anne_declaration.setError("L'anneé de declaration doit etre compose de quatre chiffre !!");
            return  false ;

        }

        return  true  ;
    }

}
