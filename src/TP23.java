import java.util.ArrayList;
import java.util.Scanner;

public class TP23 {
    public static void main (String[] args){
        ArrayList<String> LangagesProgrammation = new ArrayList<String>();

        System.out.println("Saisir le nombre de langages de programmation");
        int nblangages = new Scanner(System.in).nextInt();

        for (int i = 0; i<nblangages ; i++){
            System.out.printf("Entrez le langage de programmation numéro %d : ", (i));
            LangagesProgrammation.add(new Scanner(System.in).nextLine());
        }
        for (int i = 0; i<nblangages; i++){
            System.out.printf("Langage numéro %d : %s\n", (i), LangagesProgrammation.get(i));
        }

        System.out.println("Combien de langages souhaitez-vous retirer de la liste ?");
        int nblangagessupp = new Scanner(System.in).nextInt();
        nblangages= nblangages - nblangagessupp;

        for (int i = 0; i<nblangagessupp; i++) {
            System.out.printf("Quel langages voulez vous supprimer en %d ème ?", i);
            LangagesProgrammation.remove(new Scanner(System.in).nextLine());
        }

        for (int i = 0; i<nblangages; i++){
            System.out.printf("Langage numéro %d : %s\n", (i), LangagesProgrammation.get(i));
        }
    }
}