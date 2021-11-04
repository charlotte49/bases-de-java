import java.util.Scanner;

public class TP18 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Saisir un texte");
        String t = keyb.nextLine();
        String inv = "";
        for (int i = 0; i < t.length(); i++) {
            inv = t.charAt(i) + inv;
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != inv.charAt(i)) {
                System.out.println("Le texte n'est pas un palindrome");
                break;
            } else {
                System.out.println("Le texte est un palindrome");
            }
        }
    }
}