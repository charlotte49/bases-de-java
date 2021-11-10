package TP5POO;

public class Bibliotheque {
    String nomBibliotheque;
    String[] exemplaires;

    public Bibliotheque(String nomBibliotheque, String[] exemplaires){
        this.nomBibliotheque = nomBibliotheque;
        this.exemplaires = exemplaires;
        System.out.println("La bibliotheque "+this.nomBibliotheque+" est ouverte !\n");
    }

    public String getNomBibliotheque() {
        return nomBibliotheque;
    }

    public int getNbExemplaires() {
        return exemplaires.length;
    }

    public void stocker(String[] exemplaires) {
        this.Oeuvre = Oeuvre;
        getNbExemplaires();
        exemplaires.add(this.exemplaires);
    }

    public String[] listerExemplaires (Oeuvre Oeuvre, String langueOeuvre){
        return
    }

    public int compterExemplaires (Oeuvre Oeuvre){
        return
    }

    public String[] afficherAuteur(){
        return
    }
}