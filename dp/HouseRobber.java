package dp;

import java.util.Arrays;

public class HouseRobber {

    int maxVal(int[] nums,int n,int[] dp){
        if(n==0) return nums[n];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int pick=nums[n]+maxVal(nums,n-2,dp);
        int notPick = 0+maxVal(nums,n-1,dp);

        return dp[n]=Math.max(pick,notPick);
    }
    public int rob(int[] nums) {
        int n= nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return maxVal(nums,n-1,dp);
    }

    public static void main(String[] args) {
        HouseRobber obj = new HouseRobber();
        System.out.println(obj.rob(new int[]{1,2,3,1}));
    }
}
