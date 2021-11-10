package TP5POO;

public class TP5POO {
    public static void main (String[] args){
        Auteur a1 = new Auteur("Victor Hugo", false);
        Oeuvre o1 = new Oeuvre("Les Misérables", new Auteur("Victor Hugo",false));
        Exemplaire e1 = new Exemplaire(new Oeuvre("Les Misérables", new Auteur("Victor Hugo",false)));

        Auteur a2 = new Auteur("Victor Hugo", true);
        Oeuvre o2 = new Oeuvre("Les Misérables", new Auteur("Victor Hugo", true));
        Exemplaire e2 = new Exemplaire("Les Miserables");

        Auteur a3 = new Auteur("Victor Hugo", true);
        Oeuvre o3 = new Oeuvre("L'Homme qui rit", "Victor Hugo");
        Exemplaire e3 = new Exemplaire("L'Homme qui rit");

        Auteur a4 = new Auteur("Alexandre Dumas", true);
        Oeuvre o4 = new Oeuvre("Le Comte de Monte-Cristo", "Alexandre Dumas");
        Exemplaire e4 = new Exemplaire("Le Comte de Monte-Cristo");

        Auteur a5 = new Auteur("Alexandre Dumas", true);
        Oeuvre o5 = new Oeuvre("Le Comte de Monte-Cristo", "Alexandre Dumas");
        Exemplaire e5 = new Exemplaire("Le Comte de Monte-Cristo");

        Auteur a6 = new Auteur("Alexandre Dumas", true);
        Oeuvre o6 = new Oeuvre("Le Comte de Monte-Cristo", "Alexandre Dumas");
        Exemplaire e6 = new Exemplaire("Le Comte de Monte-Cristo");

        Auteur a7 = new Auteur("Raymond Queneau", true);
        Oeuvre o7 = new Oeuvre("Zazie dans le métro", "Raymond Queneau");
        Exemplaire e7 = new Exemplaire("Zazie dans le métro");

        Auteur a8 = new Auteur("Alexandre Dumas", true);
        Oeuvre o8 = new Oeuvre("The count of Monte-Cristo", "Alexandre Dumas", "anglais");
        Exemplaire e8 = new Exemplaire("The count of Monte-Cristo");

        Bibliotheque b1 = new Bibliotheque("municipale");

        System.out.println(b1);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
        System.out.println(e6);
        System.out.println(e7);
        System.out.println(e8);
    }
}