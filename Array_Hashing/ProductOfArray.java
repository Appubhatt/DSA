package Array_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Product of Array Except Self
public class ProductOfArray {
    public static int[] productExceptSelf(int[] nums) {
       int[] ans = new int[nums.length];
        int product=1;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i!=j){
//                    product*=nums[j];
//                }
//            }
//            ans[i]=product;
//            product=1;
//        }
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=0){
//                product*=nums[i];
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            try{
//                ans[i]=product/nums[i];
//            }catch (Exception e){
//               ans[i]=0;
//            }
//        }
        ans[0] =1;
        int pre=1,post=1;
        for (int i=0;i< nums.length-1;i++){
            pre=pre*nums[i];
            ans[i+1]=pre;
        }

        for (int i = nums.length-1; i > 0 ; i--) {
            post=post*nums[i];
            ans[i-1]=ans[i-1]*post;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{10,20,0,30})));
    }
}
