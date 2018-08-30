package com.example.mac.douaneproject.adabter;

public class DeclarationChamp {

    private  String titre  ;
    private  String valeur ;

    public DeclarationChamp(String titre, String valeur) {
        this.titre = titre;
        this.valeur = valeur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }
}
