package Array_Hashing;

import java.util.Arrays;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]>target){
                j--;
            }
            if(numbers[i]+numbers[j]<target){
                i++;
            }
            if(numbers[i]+numbers[j]==target){
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        TwoSum2 obj = new TwoSum2();
        System.out.println(Arrays.toString(obj.twoSum(new int[]{1,2,7,10,11},9)));
    }
}
//Brute force
/*
int[] arr = new int[2];
    int temp;
        for (int i = 0; i < numbers.length-1; i++) {
        temp=target-numbers[i];
        for (int j = i+1; j < numbers.length; j++) {
        if(numbers[j]==temp){
        arr[0]=i+1;
        arr[1]=j+1;
        return arr;
        }
        if(numbers[j]>temp){
        break;
        }
        }
        temp=target;
        }
        return arr;*/
