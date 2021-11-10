/*class Auteur{
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

class Oeuvre{
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

class Exemplaire{
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
}*/

class Bibliotheque{
    String nomBibliotheque;
    String[] exemplaires;


}

public class TP5POO {
}