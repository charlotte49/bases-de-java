import java.util.Scanner;

class Patient{
    private double poids;
    private double taille;
    public double IMC() {
        return poids / ( taille * taille);
    }
    public double getPoids(){
        return poids;
    }
    public void setPoids(double poids){
        this.poids = poids;
    }
    public double getTaille(){
        return taille;
    }
    public void setTaille(double taille){
        this.taille = taille;
    }
}

public class TP2POO {
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        Patient p1 = new Patient();
        System.out.println("Quel est le poids du patient?");
        p1.setPoids(keyb.nextInt());
        System.out.println("Quelle est la taille du patient?");
        p1.setTaille(keyb.nextInt());
        System.out.println("Le poids du patient est " +p1.getPoids());
        System.out.println("La taille du patient est " +p1.getTaille());
        System.out.println("L'IMC du patient est " +p1.IMC());
    }
}