package DLP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TokenIdentifier {
    static String[] hash1 = new String[10];
    static String[] token = new String[10];

    public static void hash2(String in) {
        int a = 0;
        for (int i = 0; i < in.length(); i++) {
            a += in.charAt(i);
        }

        int mod = a % 10;
        if (hash1[mod] == null || hash1[mod].isEmpty()) {
            hash1[mod] = in;
        } else {
            hash1[mod] = in;
            mod++;
            while (!hash1[mod].isEmpty()) {
                mod++;
                if (mod > 9) {
                    mod = 0;
                }
            }
            hash1[mod] = in;
            token[mod] = "Identifier";
        }
    }

    public static void main(String[] args) {
        String input;

        try {
            BufferedReader newfile = new BufferedReader(new FileReader("C:/Flex Windows/EditPlusPortable/pr4/pr9/output.txt"));
            String line;

            while ((line = newfile.readLine()) != null) {
                System.out.println(line);
                hash2(line);
            }

            newfile.close();

            System.out.println("\nNo.\t-->\tLexeme\tToken");
            for (int j = 0; j < 10; j++) {
                System.out.println(j + "\t-->\t" + hash1[j] + "\t" + token[j]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

