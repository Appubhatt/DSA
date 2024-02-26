package binarysearch;

import java.util.Arrays;

public class FloorAndCeilInSortedArray {

   static int getFloor(int n,int x,int[] arr){
       int low=0;
       int high=n-1;
        int ans=-1;
        while(low<=high){

            int mid=(low+high)/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }
    static int getCeil(int n,int x,int[] arr){
        int ans=-1;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=arr[mid];
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
    public static int[] ceilingInSortedArray( int[] arr,int n, int x) {
        // Write your code here.
        int f=getFloor(n,x,arr);
        int c=getCeil(n,x,arr);
        return new int[]{f,c};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ceilingInSortedArray(new int[]{3, 4, 4, 7 , 8, 10},6,3)));
    }
}
