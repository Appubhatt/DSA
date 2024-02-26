package stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerToRight {
    static int[] smallerToRight(int arr[],int n){
        int[] ans= new int[n];
        Stack<Integer>stack = new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            if (stack.isEmpty()){
                ans[i]=-1;
            }
            else if(!stack.isEmpty() && stack.peek()<arr[i]){
                ans[i]=stack.peek();
            } else if (!stack.isEmpty() && stack.peek()>=arr[i]) {
                while (!stack.isEmpty() && stack.peek()>=arr[i]){
                    stack.pop();
                }
                ans[i]=!stack.isEmpty()? stack.peek() : -1;
            }
            stack.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerToRight(new int[]{1,3,2,4},4)));
    }
}
