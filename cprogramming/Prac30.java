package cprogramming;

import java.util.Scanner;

public class Prac30 {
    public static void main(String[] args) {
        String s;
        Scanner scan = new Scanner(System.in);
        int i=0;
        System.out.println("Enter first String:");
        s = scan.next();
        for(char c: s.toCharArray()) {
            i++;
        }
        System.out.println(i);
    }
}
