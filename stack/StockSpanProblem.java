package stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int[] totalSpan = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
           if(stack.isEmpty()){
               totalSpan[i]=-1;
           } else if (!stack.isEmpty() && price[i]<price[stack.peek()]) {
               totalSpan[i]=stack.peek();
           }else if(!stack.isEmpty() && price[i]>=price[stack.peek()]){
               while(!stack.isEmpty() && price[i]>=price[stack.peek()]){
                   stack.pop();
               }
               totalSpan[i]=stack.isEmpty()?-1:stack.peek();
           }
           stack.push(i);
        }
        for (int i=0;i<n;i++){
            totalSpan[i]=i-totalSpan[i];
        }
        return totalSpan;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculateSpan(new int[]{10,10,10,10,10,10},6)));
    }
}
