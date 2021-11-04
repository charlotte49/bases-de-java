import java.util.Scanner;

public class TP15 {
    public static void main (String[] args){
        Scanner keyb = new Scanner(System.in);

        System.out.println("Entrez la taille du premier tableau");
        int l1 = keyb.nextInt();
        int[] tableau = new int[l1];
        for (int j = 0; j<tableau.length; j++) {
            System.out.printf("tableau[%d] : ", j);
            tableau[j] = keyb.nextInt();
        }
        System.out.println("\n\n");

        System.out.println("Entrez la taille du deuxieme tableau");
        int l2 = keyb.nextInt();
        int[] tableau2 = new int[l2];
        for (int j = 0; j<tableau2.length; j++) {
            System.out.printf("tableau2[%d] : ", j);
            tableau2[j] = keyb.nextInt();
        }
        System.out.println("\n\n");

        System.out.println("Entrez la taille du troisieme tableau");
        int l3 = keyb.nextInt();
        int[] tableau3 = new int[l3];
        for (int j = 0; j<tableau3.length; j++) {
            System.out.printf("tableau3[%d] : ", j);
            tableau3[j] = keyb.nextInt();
        }
        System.out.println("\n\n");

        for (int j = 0; j<tableau.length; j++) {
            System.out.printf("tableau[%d] : %d\n", j, tableau[j]);
        }

        for (int j = 0; j<tableau2.length; j++) {
            System.out.printf("tableau2[%d] : %d\n", j, tableau2[j]);
        }

        for (int j = 0; j<tableau3.length; j++) {
            System.out.printf("tableau3[%d] : %d\n", j, tableau3[j]);
        }

        int o=0;
        for (int i= 0; i<tableau.length; i++) {
            if (tableau[i] %3 == 0) {
                    o=o+tableau[i];
            }
        }
        for (int i= 0; i<tableau2.length; i++) {
            if (tableau2[i] %3 == 0) {
                o=o+tableau2[i];
            }
        }
        for (int i= 0; i<tableau3.length; i++) {
            if (tableau3[i] %3 == 0) {
                o=o+tableau3[i];
            }
        }
        System.out.println(+o);
    }
}
