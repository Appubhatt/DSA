package cprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac38 {
    void mergeSort(int arr[], int low, int high) {
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    void merge(int[] arr, int low, int mid, int high) {
        // TODO Auto-generated method stub
        List<Integer> temp = new ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high) {
            if(arr[left]<=arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid) {
            temp.add(arr[left]);
            left++;

        }
        while(right<=high) {
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++) {
            arr[i]=temp.get(i-low);
        }
    }
    public static void main(String[] args) {
        Prac38 sort = new Prac38();
        int arr[] ={9, 4, 7, 6, 3, 1, 5};
        sort.mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
