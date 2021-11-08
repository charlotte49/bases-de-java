class Rectangle{
    private double hauteur;
    private double largeur;
    public double perimetre(){
        return hauteur * largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
}

public class TP1POO {
    public static void main(String[] args){
        Rectangle h1 = new Rectangle();
        h1.setHauteur(23);
        h1.setLargeur(45);
        System.out.println("Le périmètre du rectangle est" + h1.perimetre());
    }
}