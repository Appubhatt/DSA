package recursion;

import java.util.*;

public class Subset2 {

    void func(int idx,int nums[],List<Integer> ds,List<List<Integer>> lists){
        lists.add(new ArrayList<>(ds));
        for (int i=idx;i< nums.length;i++){
            if(i!=idx && nums[i]== nums[i-1]) continue;
            ds.add(nums[i]);
            func(i+1, nums, ds, lists);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        func(0,nums,new ArrayList<>(),lists);
        return lists;
    }
    public static void main(String[] args) {
        Subset2 obj= new Subset2();
        int[] arr={1,2,2};
        System.out.println(obj.subsetsWithDup(arr));
    }
}
