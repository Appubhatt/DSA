package slidingwindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

//Maximum Rectangular Area in a Histogram GFG
public class MaximumAreaHistogram {
    private int[] nextElement(int[] heights, int length) {
        int[] ans = new int[length];
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        for (int i = length-1; i >=0; i--) {
            int curr=heights[i];
            while(stack.peek()!=-1 && heights[stack.peek()]>=curr){
                stack.pop();
            }
            ans[i]= stack.peek();
            stack.push(i);
        }
        return ans;
    }

    private int[] prevElement(int[] heights, int length) {
        int[] ans = new int[length];
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        for (int i = 0; i <length; i++) {
            int curr=heights[i];
            while(stack.peek()!=-1 && heights[stack.peek()]>=curr){
                stack.pop();
            }
            ans[i]= stack.peek();
            stack.push(i);
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int result=0;
        int n=heights.length;
        int[] prev = prevElement(heights,n);
        int[] next = nextElement(heights,n);
        for (int i = 0; i < n; i++) {
            int l=heights[i];
            if (next[i]==-1){
                next[i]=n;
            }
            int b = next[i]-prev[i]-1;
            int newArea=l*b;

            result=Math.max(result,newArea);
        }
        return result;
    }



    public static void main(String[] args) {
        MaximumAreaHistogram obj = new MaximumAreaHistogram();
        System.out.println(obj.largestRectangleArea(new int[]{2,4}));
    }
}
