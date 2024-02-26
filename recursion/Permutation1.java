package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Permutation1 {

    void findPermutation(int[] nums,ArrayList<Integer> ds, boolean[] freq,List<List<Integer>> ansList){
        if(ds.size()== nums.length){
            ansList.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i< nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                findPermutation(nums,ds,freq,ansList);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        //Map<Integer,Integer> map = new HashMap<>();
        boolean[] freq = new boolean[nums.length];
        findPermutation(nums,new ArrayList<>(),freq,ansList);
        return ansList;
    }

    public static void main(String[] args) {
        Permutation1 obj = new Permutation1();
        int[] arr = {1,2,3};
        System.out.println(obj.permute(arr));
    }
}
