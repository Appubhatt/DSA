package binarysearch;

public class Bounds {

    static int getLowerBoundRecursion(int[] arr, int n,int x,int low,int high,int ans){
        if(low>high){
            return ans;
        }
        int mid=(low+high)/2;
        if(arr[mid]>x){
            ans=mid;
            return getLowerBoundRecursion(arr,n,x,low,mid-1,ans);
        }
        else {
            return getLowerBoundRecursion(arr,n,x,mid+1,high,ans);
        }
    }
    static int getLowerBound(int[] arr, int n,int x){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    static int getUpperBound(int[] arr, int n,int x){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getUpperBound(new int[]{3,5,8,15,19},5,15));
    }
}
