public class TPfonction {
        static int[] direction(String[] dir){
            int tab[] = new int[2];
            for (int i = 0; i < dir.length; i++) {
                if (dir[i] == "haut") {
                    tab[0] = +1;
                }
                if (dir[i] == "bas") {
                    tab[0] = -1;
                }
                if (dir[i] == "gauche") {
                    tab[1] = -1;
                }
                if (dir[i] == "droite") {
                    tab[1] = +1;
                }
            }
            return tab;
        }
}