package stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreaterToLeft {
    public static int[] greaterToLeft(int[] arr,int n){
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            if(stack.isEmpty()){
                ans[i]=-1;

            } else if (!stack.isEmpty() && stack.peek()>arr[i]) {

                ans[i]=stack.peek();

            } else if (!stack.isEmpty() && stack.peek()<=arr[i]) {

                while(!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
                ans[i]=(stack.isEmpty())?-1:stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(greaterToLeft(new int[]{1,3,0,0,1,2,4},7)));
    }
}
