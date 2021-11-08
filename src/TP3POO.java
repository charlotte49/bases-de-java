class Tirelire {
    private double montant1;
    private double montant2;
    private double montant3;
    private double difference = montant2 - montant3;

    public double getMontant() {
        return montant2;
    }

    public String afficher() {
        if (montant2 <= 0) {
            return "Vous êtes sans le sou";
        } else {
            return "Vous avez: " + montant2;
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

    public void remplir(double montant1) {
        if (montant1 > 0) {
            this.montant1 = montant1;
        }
    }

    public void vider(double montant2) {
        montant2 = 0;
    }

    public void puiser(double montant3) {
        if (montant3 > montant2) {
            vider(montant2);
        } else if (montant3 < montant2) {
            montant2 = montant2 - montant3;
        } else if (montant3 < 0) {
            montant2 = montant2;
        }
    }

    public double calculerSolde(){
        if (montant3 > 0) {
            return difference;
        } else {
            return montant2;
        }
    }
}

public class TP3POO {
}