package cprogramming;

import java.util.Scanner;

public class Prac29 {
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first String:");
        s1 = scan.next();
        System.out.println("Enter second String:");
        s2=scan.next();
        String s3="";
        for(int i=0;i<s1.length();i++){
            s3+=s1.charAt(i);
        }

        for(int i=0;i<s2.length();i++){
            s3+=s2.charAt(i);
        }
        System.out.println(s3);
    }
}
