package TP5POO;

public class Oeuvre {
    String titreOeuvre;
    Auteur Auteur;
    String langueOeuvre;

    public Oeuvre(String titreOeuvre, Auteur Auteur, String langueOeuvre){
        this.titreOeuvre = titreOeuvre;
        this.Auteur = Auteur;
        this.langueOeuvre = langueOeuvre;
    }

    public Oeuvre(String titreOeuvre, Auteur Auteur){
        this.titreOeuvre = titreOeuvre;
        this.Auteur = Auteur;
        this.langueOeuvre = "français";
    }

    public String getTitre(){
        return titreOeuvre;
    }

    public Auteur getAuteur(){
        return Auteur;
    }

    public String getLangue(){
        return langueOeuvre;
    }

    public String toString(){
        return ""+this.titreOeuvre+", "+this.Auteur+", en "+this.langueOeuvre+"";
    }
}
