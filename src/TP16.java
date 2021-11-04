import java.util.Scanner;

public class TP16 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        System.out.println("Entrez la taille du premier tableau");
        int l1 = keyb.nextInt();
        int[] tableau = new int[l1];
        for (int j = 0; j < tableau.length; j++) {
            System.out.printf("tableau[%d] : ", j);
            tableau[j] = keyb.nextInt();
        }
        System.out.println("\n\n");

        for (int j = 0; j<tableau.length; j++) {
            System.out.printf("tableau[%d] : %d\n", j, tableau[j]);
        }
    }
}
