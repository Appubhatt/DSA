package cprogramming;

public class Prac46 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {

                System.out.print(" ");
            }

            int k = 1;
            for (int j = 1; j <= i; j++) {

                System.out.print(k + " ");
                k = k * (i - j) / j;
            }
            System.out.println();
        }
    }
}
