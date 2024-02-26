package slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumSubarrayofsizeK {
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        // code here
        long ans=0;
        long sum=0;
        int i=0,j=0;
        while(j<N){
            sum+=Arr.get(j);
            if(j-i+1<K){
                j++;
            }
            else if(j-i+1==K){
                ans=Math.max(ans,sum);
                sum-=Arr.get(i);
                i++;j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maximumSumSubarray(2, new ArrayList<Integer>(Arrays.asList(100,200,300,400)),4));
    }
}
