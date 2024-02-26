package cprogramming;

import java.util.Arrays;

//34 Selection Sort
public class Prac34 {
    public static void main(String[] args) {
        int[] arr={1,43,765,8,5,2,54,7};
        int temp;
        int idx;

        for(int i=0;i< arr.length-1;i++){
            idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[idx]){
                    idx=j;
                }
            }
            int small = arr[idx];
            arr[idx]=arr[i];
            arr[i]=small;
        }
        System.out.println("Sorted array:"+ Arrays.toString(arr));
    }

}
