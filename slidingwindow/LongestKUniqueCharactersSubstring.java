package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestKUniqueCharactersSubstring {
    public static int longestkSubstr(String s, int k) {
        // code here
        int maxLen=-1;
        Map<Character,Integer> countMap = new HashMap<>();
        int i=0;int j=0;
        int n=s.length();
        if (s.length()==0) return 0;
        while(j<n){
            countMap.put(s.charAt(j), countMap.getOrDefault(s.charAt(j),0)+1);

            if (countMap.size()==k){
                maxLen=Math.max(maxLen,j-i+1);
               // j++;
            }
            if (countMap.size()>k){
                while(countMap.size()>k){
                    countMap.put(s.charAt(i),countMap.get(s.charAt(i))-1);
                    if(countMap.get(s.charAt(i))==0){
                        countMap.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            j++;
            System.out.println(countMap);

        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(longestkSubstr("aaaa",2));
    }
}
