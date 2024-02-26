package slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfAnagrams {
    int search(String pat, String txt) {
        // code here
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < pat.length(); i++) {
           map.put(pat.charAt(i),map.getOrDefault(pat.charAt(i),0)+1);
        }
        int i=0,j=0;
        int k=pat.length();
        int ans=0;
        int count = map.size();
        while(j<txt.length()){
            if(map.containsKey(txt.charAt(j))){
                System.out.println(map);
                map.put(txt.charAt(j),map.get(txt.charAt(j))-1);
                if(map.get(txt.charAt(j))==0){
                    count=count-1;
                }
            }
            if(j-i+1<k){
                j++;
            } else if (j-i+1==k) {
                if(count==0){
                    System.out.println(count);
                    ans=ans+1;
                }
                if(map.containsKey(txt.charAt(i))){
                    map.put(txt.charAt(i),map.get(txt.charAt(i))+1);
                    if(map.get(txt.charAt(i))==1){
                        count++;
                    }
                }

                i++;
                j++;
            }

        }
        System.out.println(count);
        return ans;
    }

    public static void main(String[] args) {
        CountOccurrenceOfAnagrams obj = new CountOccurrenceOfAnagrams();
        System.out.println(obj.search("irc","eaylnlfdxf"));
    }
}
