package binarysearch;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    int getLowerBound(int[] nums,int target){
        int ans=nums.length;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
    int getUpperBound(int nums[],int target){
        int ans=nums.length;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb = getLowerBound(nums,target);
        if(lb == nums.length || nums[lb]!=target) return new int[]{-1,-1};
        return new int[]{lb,getUpperBound(nums,target)-1};
    }
    int countOccurrence(int num[],int target){
        int[] ans = searchRange(num,target);
        if(ans[0]<0) return 0;
        return ans[1]-ans[0]+1;
    }

    public static void main(String[] args) {
        FirstAndLastPositionOfElement obj = new FirstAndLastPositionOfElement();
        System.out.println(Arrays.toString(obj.searchRange(new int[]{5,7,7,8,8,8,8,10},8)));
        System.out.println(obj.countOccurrence(new int[]{5,7,7,8,8,8,8,10},8));
    }
}
