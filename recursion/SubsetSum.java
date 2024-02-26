package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum {
    void func(int ind,int sum, ArrayList<Integer> arr,int N,ArrayList<Integer> sumSubset){
        if(ind>=N){
            sumSubset.add(sum);
            return;
        }
        //Pick the element
        func(ind+1,sum+arr.get(ind),arr,N,sumSubset);
        //Not pick the element
        func(ind+1,sum,arr,N,sumSubset);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0,0,arr,N,sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }

    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(3);
       list.add(1);
       list.add(2);
        SubsetSum ss = new SubsetSum();
        System.out.println(ss.subsetSums(list,3));
    }
}
