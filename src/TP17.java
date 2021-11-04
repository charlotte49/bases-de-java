import java.util.Scanner;

public class TP17 {
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        System.out.println("Saisir un texte");
        String t = keyb.nextLine();
        String inv=" ";
        for (int i = 0; i<t.length(); i++){
            inv= t.charAt(i) +"inv" ;
        }
        System.out.println("Le texte inversé est " + inv);
    }
}