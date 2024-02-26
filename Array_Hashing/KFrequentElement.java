package Array_Hashing;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KFrequentElement {
    public int[] topKFrequent(int[] nums,int k){
        //min heap method
        Map<Integer,Integer> count = new HashMap<>();
        for (int i : nums) {
            count.put(i,count.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        for(Map.Entry entry : count.entrySet()){
            pq.add(entry);
        }
        System.out.println(pq);
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i]=pq.poll().getValue();
        }
        return arr;
    }

    public static void main(String[] args) {
        KFrequentElement obj = new KFrequentElement();
        System.out.println(Arrays.toString(obj.topKFrequent(new int[]{1,2,3},3)));
    }
}
//bucket sort method
  /*  Map<Integer,Integer> count = new HashMap<>();
    List<Integer>[] bucket = new List[nums.length+1];
        for (int n:nums){
                count.put(n,count.getOrDefault(n,0)+1);
                }
                System.out.println(count);
                for(int i: count.keySet()){
                int freq = count.get(i);
                if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
        }
        bucket[freq].add(i);

        }
        System.out.println(Arrays.toString(bucket));
        List<Integer>saveData = new ArrayList<>();
        int counter=0;
        for(int pos = bucket.length-1;pos>=0 && counter<k;pos--){
        if(bucket[pos]!=null){
        for(int idx:bucket[pos]){
        saveData.add(idx);
        counter++;
        }
        }
        }
        System.out.println(saveData);
        int[] ans = new int[saveData.size()];
        for (int i = 0; i < saveData.size(); i++) {
        ans[i]=saveData.get(i);
        }

        return ans;*/