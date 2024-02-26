package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayOfSumK {

    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        Map<Integer,Integer> preSumMap = new HashMap<>();

        int sum=0;
        int maxLen=0;

        for (int i = 0; i < N; i++) {
            sum+=A[i];

            if(sum==K){
                maxLen=Math.max(maxLen,i+1);
            }

            int rem=sum-K;

            if (preSumMap.containsKey(rem)){
                int len=i-preSumMap.get(rem);
                maxLen=Math.max(maxLen,len);
            }

            if (!preSumMap.containsKey(sum)){
                preSumMap.put(sum,i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lenOfLongSubarr(new int[]{-13, 0, 6, 15, 16, 2 ,15, -12, 17, -16, 0, -3, 19, -3, 2 ,-9, -6},17,15));
    }

}
//Works with Positive only
   /* int i=0;
    int  j=0;
    int max=0;
    int sum=0;
        while(j<N){
        sum+=A[j];
        if(sum<K){
        j++;
        }
        if(sum==K){
        max=Math.max(max,j-i+1);
        j++;
        }
        if(sum>K){
        while(sum>K){
        sum=sum-A[i];
        i++;
        j++;
        }
        }
        }
        return max;*/