public class TP10 {
    public static void main(String[] args) {
        System.out.println("Tables de multiplication\n");
        for (int i = 2; i <= 10; i++) {
            System.out.printf("\nTable de %d :\n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
    }
}
