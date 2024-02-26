package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation2 {
    void findPermutation(int idx,int[] nums,List<List<Integer>> ansList){
        if(idx == nums.length){
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length ; i++) {
                ds.add(nums[i]);
            }
            ansList.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(i,idx,nums);
            findPermutation(idx+1,nums,ansList);
            swap(i,idx,nums);
        }
    }

    private void swap(int i, int idx, int[] nums) {
        int temp = nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        findPermutation(0,nums,ansList);
        return ansList;
    }
    public static void main(String[] args) {
        Permutation2 obj = new Permutation2();
        int[] arr = {1,2,3};
        System.out.println(obj.permute(arr));
    }
}
