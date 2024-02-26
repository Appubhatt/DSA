package Array_Hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int longest=1;
        for(int num : nums){
            //check if the num is the start of a sequence by checking if left exists
            if(!set.contains(num-1)){
                int count=1;
                while (set.contains(num+1)){
                    count++;
                    num++;
                }
                longest= Math.max(longest,count);
            }
            if(longest>nums.length/2) break;
        }

        return longest;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
        System.out.println(obj.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }
}
