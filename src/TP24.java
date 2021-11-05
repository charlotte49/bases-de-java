import java.util.ArrayList;
import java.util.Scanner;

public class TP24 {
    public static void main (String[] args) {
        ArrayList<Integer> ListeNombres = new ArrayList<Integer>();

        System.out.println("Saisir le nombre de nombres");
        int Nombres = new Scanner(System.in).nextInt();

        for (int i = 0; i < Nombres; i++) {
            System.out.printf("Entrez le langage de programmation numéro %d : ", i);
            ListeNombres.add(new Scanner(System.in).nextInt());
        }
        for (int i = 0; i < Nombres; i++) {
            System.out.printf("Langage numéro %d : %d\n", (i), ListeNombres.get(i));
        }
        System.out.println("Combien de nombres souhaitez-vous retirer de la liste ? ");
        int Nombressupp = new Scanner(System.in).nextInt();
        int Nombressupp2 = Nombressupp;
        for (int i = 0; i < Nombressupp; i++) {
            System.out.println("i : "+i);
            System.out.printf("Quel nombre voulez vous supprimer en %d ème ? ", i);
            int l = new Scanner(System.in).nextInt();
            int k = 0;
            System.out.println("k : "+k);
            for (int j = 0; j < Nombres; j++) {
                System.out.println ("j : "+j);
                System.out.println("k : "+k);
                if (ListeNombres.get(j).equals(l)) {
                    System.out.println("new Scanner(System.in).nextInt() : "+l);
                    k = k + 1;
                }
            }
            System.out.println("hello");
            if (k >= 2) {
                Nombressupp2 = Nombressupp2 + k - 1;
            }
            ListeNombres.remove(l);
            Nombres = Nombres - 1;
        }
        Nombres = Nombres - Nombressupp2;
        for (int i = 0; i<Nombres; i++){
            System.out.printf("Nombre numéro %d : %d\n", i, ListeNombres.get(i));
        }
    }
}