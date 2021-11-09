package TP5POO;

public class Exemplaire {

    String refOeuvre;

    public Exemplaire(String refOeuvre){
        System.out.println("Nouvel exemplaire ->"+this.titreOeuvre+", "+this.nomAuteur+", en "+this.langueOeuvre+"\n");
    }

    public Exemplaire (Exemplaire exemp){
        refOeuvre = exemp.refOeuvre;
        System.out.println("Copie d'un exemplaire de ->"+this.titreOeuvre+", "+this.nomAuteur+", en "+this.langueOeuvre+"\n");
    }

    public String getOeuvre(){
        return refOeuvre;
    }

    public String toString(){
        return "Un exemplaire de "+this.titreOeuvre+", "+this.nomAuteur+", en "+this.langueOeuvre+"";
    }
}
