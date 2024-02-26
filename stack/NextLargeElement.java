package stack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

//Nearest greater to right
public class NextLargeElement {
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        long[] ans = new long[n];
        Stack<Long> stack= new Stack<>();
        stack.push(-1l);
        for (int i=n-1;i>=0;i--){
            long curr = arr[i];
            while(stack.peek()<=curr){
                stack.pop();
            }
            ans[i]=!stack.isEmpty()?-1:stack.peek();
            stack.push(curr);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextLargerElement(new long[]{1,3,0,0,1,2,4},7)));
    }
}
/*
 for (int i=n-1;i>=0;i--){
         if(stack.isEmpty()){
         ans[i]=-1;
         stack.push(arr[i]);
         } else if ((!stack.isEmpty()) && arr[i]<stack.peek() ) {
        ans[i]=stack.peek();
        stack.push(arr[i]);
        } else if ((!stack.isEmpty()) && arr[i]>=stack.peek()) {
        while( (!stack.isEmpty()) && (arr[i] >= stack.peek())){
        stack.pop();
        }
        ans[i]=(!stack.isEmpty())?stack.peek():-1;
        stack.push(arr[i]);
        }
        }*/
