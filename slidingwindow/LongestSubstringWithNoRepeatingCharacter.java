package slidingwindow;

import java.util.*;

public class LongestSubstringWithNoRepeatingCharacter {
    public static int lengthOfLongestSubstring(String s) {
     List<Character>subStr = new ArrayList<>();
     int maxL=0;
        for (int i = 0; i <s.length(); i++) {
            if(subStr.contains(s.charAt(i))){
                int idx=subStr.indexOf(s.charAt(i));
                subStr.remove(idx);
                if(idx>0){
                    subStr.subList(0,idx).clear();
                }
            }
            subStr.add(s.charAt(i));
            maxL=Math.max(maxL,subStr.size());
        }
     return maxL;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("  System.out.println("));
    }
}

  /*  HashSet<Character> set = new HashSet<>();
    int left = 0;
    int maxLength = 0;
        for(int right = 0; right<s.length(); right++) {
        if(!set.contains(s.charAt(right))) {
        set.add(s.charAt(right));
        maxLength = Math.max(maxLength, right - left+1);
        } else {
        while(set.contains(s.charAt(right))) {
        set.remove(s.charAt(left));
        left++;
        }
        set.add(s.charAt(right));
        }
        }
        return maxLength;*/
/*
    int maxLen=0;
    int i=0;
    int j=0;
    int n=s.length();

    Map<Character,Integer> charCount = new HashMap<>();
        while(j<n){
        charCount.put(s.charAt(j),charCount.getOrDefault(s.charAt(j),0)+1);
        System.out.println(charCount);
        if(charCount.size()==j-i+1){
        maxLen=Math.max(maxLen,charCount.size());
        j++;
        }
        else if(charCount.size()<j-i+1){
        while(charCount.size()<j-i+1){
        charCount.put(s.charAt(i),charCount.get(s.charAt(i))-1);
        if (charCount.get(s.charAt(i))==0){
        charCount.remove(s.charAt(i));
        }
        i++;
        }
        j++;
        }
        }

        return maxLen;*/
