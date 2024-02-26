package slidingwindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInKSize {
    public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        Queue<Long>longQueue = new ArrayDeque<>();
        List<Long> ds = new ArrayList<>();
        int i=0,j=0;
        while(j<N){
            if (A[j]<0){
                longQueue.add(A[j]);
            }
            if(j-i+1<K){
                j++;
            }
            else if(j-i+1==K){
                if(longQueue.isEmpty()){
                    ds.add(0L);
                }
                else {
                    ds.add(longQueue.peek());
                    if (A[i]<0){
                        longQueue.poll();
                    }
                }
                i++;
                j++;
            }
        }
        System.out.println(ds);
        long[] ans = new long[N-K+1];
        for (int k = 0; k < ds.size(); k++) {
            ans[k]=ds.get(k);
        }
        return new long[K];
    }

    public static void main(String[] args) {
        printFirstNegativeInteger(new long[]{12, -1, -7, 8, -15, 30, 16, 28},8,3);
    }
}
