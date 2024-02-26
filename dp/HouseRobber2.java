package dp;

import java.util.Arrays;

public class HouseRobber2 {

    int ans1(int[] nums,int n,int[] dp){
        if(n==1) return nums[n];
        if(n>1) return 0;
        if(dp[n] != -1) return dp[n];
        int pick=nums[n]+ans1(nums,n-2,dp);
        int notPick=0+ans1(nums,n-1,dp);
        return dp[n]=Math.max(pick,notPick);
    }
    int ans2(int[] nums,int n,int[] dp){
        if(n==0) return nums[n];
        if(n>0) return 0;
        if(dp[n] != -1) return dp[n];
        int pick=nums[n]+ans2(nums,n-2,dp);
        int notPick=0+ans2(nums,n-1,dp);
        return dp[n]=Math.max(pick,notPick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp = new int[n-1];
        Arrays.fill(dp,-1);
        return(Math.max(ans1(nums,n-2,dp),ans2(nums,n-1,dp)));
    }

    public static void main(String[] args) {
        HouseRobber2 obj = new HouseRobber2();
        System.out.println(obj.rob(new int[]{1,2,3,1}));
    }
}
