package heap;

import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int size : stones){
            pq.add(-size);
        }
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            if(first!=second) pq.add(first-second);
        }

        return pq.size()!=0?-pq.remove():0;
    }

    public static void main(String[] args) {
        LastStoneWeight obj = new LastStoneWeight();
        System.out.println(obj.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
}
