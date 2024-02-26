package cprogramming;

import java.util.Arrays;

//35 Insertion Sort
public class Prac35 {
    public static void main(String[] args) {
        int[] arr={1,43,765,8,5,2,54,7,9};
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j= j-1;
            }
            arr[j+1] = key;
        }
        System.out.println("Sorted array:"+ Arrays.toString(arr));
    }
}
