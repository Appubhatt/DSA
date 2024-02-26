package cprogramming;
//32 Count Words in a Sentence

import java.util.Scanner;

public class Prac32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sen = scanner.nextLine();
        int count = countWords(sen);

        System.out.println("Count:"+count);
    }

    private static int countWords(String sen) {

         if (sen == null || sen.isEmpty()) {
            return 0;
        }
        String[] words = sen.split("\\s+");

        return words.length;

    }
}
