package heap;

import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>  pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
                pq.add(nums[i]);
                if(pq.size()>k){
                    pq.poll();

            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        KthLargestElement obj = new KthLargestElement();
        System.out.println(obj.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));
    }
}
