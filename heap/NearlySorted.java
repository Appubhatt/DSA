package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class NearlySorted {
    ArrayList<Integer> nearlySorted(int arr[], int num, int k)
    {
        // your code here
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < num; i++) {
            pq.add(arr[i]);
            if (pq.size()>k){
                ans.add(pq.poll());
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        return ans;
    }

    public static void main(String[] args) {
        NearlySorted obj = new NearlySorted();
        System.out.println(obj.nearlySorted(new int[]{3,1,4,2,5},5,2));
    }
}
