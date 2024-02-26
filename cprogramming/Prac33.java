package cprogramming;

import java.util.Arrays;

//33 Bubble Sort
public class Prac33 {
    public static void main(String[] args) {
        int[] arr={1,43,765,8,5,2,54,7};
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
