package recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    void palindromePartition(int idx,String s,List<String> ds,List<List<String>>ans){
        if(idx==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<s.length();++i){
            if(isPalindrome(s,idx,i)){
                ds.add(s.substring(idx,i+1));
                palindromePartition(i+1,s,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        palindromePartition(0,s,new ArrayList<>(),ans);
        return ans;
    }

    public static void main(String[] args) {
        PalindromePartitioning obj = new PalindromePartitioning();
        System.out.println(obj.partition("aabb"));
    }
}
