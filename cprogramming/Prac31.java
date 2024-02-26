//31 Check for Anagrams
package cprogramming;

import java.util.Arrays;

public class Prac31 {
    public static void main(String[] args) {
        String s1="at";
        String s2="ea";
        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram");
            System.exit(0);
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0;i<s1.length();i++){
            if(c1[i]!=c2[i]){
                System.out.println("Not Anagram");
                System.exit(0);
            }
        }
        System.out.println("Is Anagram");
    }
}
