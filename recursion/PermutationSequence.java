package recursion;

import java.util.ArrayList;

public class PermutationSequence {
    public String getPermutation(int n, int k){
        int fact =1;
        ArrayList<Integer> numb = new ArrayList<>();
        for (int i=1;i<n;i++){
            fact*=i;
            numb.add(i);
        }
        numb.add(n);
        String ans = "";
        k--;
        while(true){
            ans+=numb.get(k/fact);
            numb.remove(k/fact);
            if(numb.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/numb.size();
        }
        return ans;
    }

    public static void main(String[] args) {
        PermutationSequence obj = new PermutationSequence();
        System.out.println(obj.getPermutation(3,3));
    }
}
