import java.util.Scanner;

public class TP11 {
    public static void main(String[] args){
        Scanner keyb = new Scanner (System.in);
        System.out.print("Entrez un nombre :");
        int nb = keyb.nextInt();
        int fn = 1;
        for (int i=1; i<=nb; i++){
            fn = fn * i;
        }
        System.out.print("Le factoriel est " +fn);
    }
}
