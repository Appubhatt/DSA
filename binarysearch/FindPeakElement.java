package binarysearch;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int n= nums.length;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]> nums[mid+1]){
                return mid;
            }
            else if (nums[mid]>nums[mid-1]){
                low=mid+1;
            }
            else {
                high=mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        FindPeakElement obj = new FindPeakElement();
        System.out.println(obj.findPeakElement(new int[]{100,2,1,3,5,6,4,10}));
    }
}
