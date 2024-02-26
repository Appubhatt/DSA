package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset1 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        findSubsets(0,new ArrayList<Integer>(),lists,nums);
        return  lists;
    }
     void findSubsets(int idx, ArrayList<Integer> ds, List<List<Integer>> lists, int[] nums) {
        if(idx>= nums.length){
            lists.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[idx]);
        findSubsets(idx+1,ds,lists,nums);
        ds.remove(Integer.valueOf(nums[idx]));
        findSubsets(idx+1,ds,lists,nums);
    }

    public static void main(String[] args) {
        Subset1 obj = new Subset1();
        int[] arr={1,2,3};
        System.out.println(obj.subsets(arr));
    }
}
