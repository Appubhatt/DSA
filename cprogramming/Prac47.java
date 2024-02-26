package cprogramming;

import java.util.Scanner;

//Print Hollow Pyramid
public class Prac47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the hollow pyramid:");
        int rows = scanner.nextInt();

        printHollowPyramid(rows);

        scanner.close();
    }
    private static void printHollowPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
