package Array_Hashing;

import java.util.*;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> temp;
        int target=0;
        int l,r=0;
        for (int i = 0; i < nums.length-2; i++) {
            if (i==0 || nums[i]!=nums[i-1]){
                target = 0-nums[i];
                l=i+1;
                r= nums.length-1;
                while (l<r){
                    if(nums[l]+nums[r]==target){
                        temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[l]);
                        temp.add(nums[r]);
                        ansList.add(temp);
                        while(l<r && nums[l]==nums[l+1]){
                            l++;
                        }
                        while(l<r && nums[r]==nums[r-1]){
                            r--;
                        }
                        l++;
                        r--;
                    }
                    else if (nums[l]+nums[r]>target){
                        r--;
                    }
                    else l++;
                }
            }
        }
        return ansList;
    }

    public static void main(String[] args) {
        Sum3 obj = new Sum3();
        System.out.println(obj.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
