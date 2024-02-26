package binarysearch;

import java.util.Arrays;

public class AggressiveCows {

    static boolean canPlace(int[] stalls,int cows,int dist){
        int cntCow=1; int last=stalls[0];
        for (int i = 0; i < stalls.length; i++) {
            if(stalls[i]-last>=dist){
                last=stalls[i];
                cntCow++;
            }
            if (cntCow==cows) return true;
        }
        return false;
    }
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int low=0;
        int high=stalls[n-1]-stalls[0];
        while (low<=high){
            int mid = (low+high)/2;
            if (canPlace(stalls,k,mid)){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        System.out.println(AggressiveCows.solve(5,3, new int[]{1,2,4,8,9}));
    }
}
