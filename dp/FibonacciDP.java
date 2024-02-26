package dp;

public class FibonacciDP {
    static int find(int n,int[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1) return dp[n];
        return dp[n]=find(n-1,dp)+find(n-2,dp);
    }

    public static void main(String[] args) {
        int n=15;
        int[]dp= new int[n+1];
        for (int i=0;i<n+1;i++){
            dp[i]=-1;
        }
        System.out.println(find(n,dp));
    }
}
