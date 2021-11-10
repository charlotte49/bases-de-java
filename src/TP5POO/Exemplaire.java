package TP5POO;

public class Exemplaire {
    Oeuvre Oeuvre;

    public Exemplaire(Oeuvre Oeuvre){
        this.Oeuvre = Oeuvre;
        System.out.println("Nouvel exemplaire ->"+this.Oeuvre+"\n");
    }

    public Exemplaire (Exemplaire exemp){
        Oeuvre = exemp.Oeuvre;
        System.out.println("Copie d'un exemplaire de ->"+this.Oeuvre+"\n");
    }

    public Oeuvre getOeuvre(){
        return Oeuvre;
    }

    public String toString(){
        return "Un exemplaire de "+this.Oeuvre+"";
    }
}