import java.util.Objects;
import java.util.Scanner;

public class TP19 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        Integer nb = keyb.nextInt();
        String t = nb.toString();
        char a = t.charAt(0);
        char b = '-';
        String c = "";
        if (a == b){
            for (int i =1; i<t.length(); i++){
                c=c + t.charAt(i);
            }
        }
        String inv = "";
        for (int i = 0; i < c.length(); i++) {
            inv = c.charAt(i) + inv;
        }
        if (Objects.equals(a, b)){
                inv = "-" + inv;
        }
        System.out.println("Le nombre inversé est "+inv);
    }
}