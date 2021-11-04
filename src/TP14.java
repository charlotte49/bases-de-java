import java.util.Scanner;

public class TP14 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Entrez la taille du tableau");
        int l = keyb.nextInt();
        int[] tableau = new int[l];
        int frequency=0, value=0;
        int o = 0;
        int i;
        for (int j = 0; j<tableau.length; j++) {
            System.out.printf("tableau[%d] : ", j);
            tableau[j] = keyb.nextInt();
        }
        System.out.println("\n\n");
        for (int j = 0; j<tableau.length; j++) {
            System.out.printf("tableau[%d] : %d\n", j, tableau[j]);
        }
        for (i= 0; i<l; i++) {
            for (int k = 0; k < l; k++) {
                if (tableau[k] == tableau[i]) {
                    o++;
                }
            }
            if (o > frequency) {
                frequency = o;
                value = tableau[i];
            }
        }
        System.out.println(+o);
        System.out.println(+tableau[i]);
    }
}