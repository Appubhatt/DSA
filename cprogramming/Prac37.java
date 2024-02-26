package cprogramming;
//37 Binary Search
public class Prac37 {
    static int binarySearch(int[] arr,int n,int l,int r,int key){
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key){
                return mid;
            } else if (arr[mid]>key) {
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println("Element is at index "+binarySearch(arr,arr.length,0, arr.length -1,5));
    }
}
