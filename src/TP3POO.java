import java.util.Scanner;

class Tirelire {
    private double montant1; /*montant que l'on met*/
    private double montant2; /*montant de la tirelire*/
    private double montant3; /*montant que l'on puise*/
    private double montant4; /*montant que l'on souhaite utiliser pour les vacances*/

    public double getMontant2() {
        return montant2;
    }

    public String afficher() {
        if (montant2 <= 0) {
            return "Vous êtes sans le sou";
        } else {
            return "Vous avez: " + montant2+"euros dans votre tirelire";
        }
    }

    public String secouer() {
        if (montant2 > 0) {
            return "Bing bing\n";
        }
        else {
            return "";
        }
    }

    /*remplir*/
    public void setMontant1(double montant1) {
        if (montant1 > 0) {
            this.montant1 = montant1;
            montant2 = montant2 + montant1;
        }
    }

    public void vider() {
        montant2 = 0;
    }

    public void puiser(double montant3) {
        if (montant3 > montant2) {
            vider();
        } else if (montant3 < montant2) {
            montant2 = montant2 - montant3;
        } else if (montant3 < 0) {
            montant2 = montant2;
        }
    }
    
    public void budgetvacances(double montant4){
        this.montant4 = montant4;
    }

    public String calculerSolde(){
        if (montant4 < montant2) {
            double a = montant2 - montant4;
            return "Vous êtes assez riche pour partir en vacances ! il vous restera "+a+" euros à la rentrée";
        }
        else if(montant4>montant2){
            double b = montant4 - montant2;
            return "il vous manque "+b+" pour partir en vacances";
        } else if (montant4<0){
            return "Vous avez "+montant2+" euros dans votre tirelire";
        }
        else {
            return "";
        }
    }
}

public class TP3POO {
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        Tirelire t1 = new Tirelire();
        System.out.println(t1.afficher());
        t1.setMontant1(keyb.nextDouble());
        System.out.println(t1.secouer());
        System.out.println(t1.afficher());
        t1.puiser(keyb.nextDouble());
        System.out.println(t1.afficher());
        System.out.println("Donnez le budget de vos vacances");
        t1.budgetvacances(keyb.nextDouble());
        System.out.println(t1.calculerSolde());
        /*t1.vider();*/
    }
}