package TP5POO;

public class Auteur {

    String nomAuteur;
    boolean prime;

    public Auteur(String nomAuteur, boolean prime){
        this.nomAuteur = nomAuteur;
        this.prime = prime;
    }

    public String getNom(){
        return nomAuteur;
    }

    public boolean getPrix(){
        return prime;
    }
}
