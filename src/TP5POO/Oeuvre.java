package TP5POO;

public class Oeuvre {

    String titreOeuvre;
    String refAuteur;
    String langueOeuvre;

    public Oeuvre(String titreOeuvre, String refAuteur, String langueOeuvre){
        this.titreOeuvre = titreOeuvre;
        this.refAuteur = refAuteur;
        this.langueOeuvre = langueOeuvre;
    }

    public Oeuvre(String titre, String nomAuteur){
        this.titreOeuvre = titreOeuvre;
        this.refAuteur = refAuteur;
        this.langueOeuvre = "français";
    }

    public String getTitre(){
        return titreOeuvre;
    }

    public String getAuteur(){
        return refAuteur;
    }

    public String getLangue(){
        return langueOeuvre;
    }

    public String toString(){
        return ""+this.titreOeuvre+", "+this.refAuteur+", en "+this.langueOeuvre+"";
    }
}
