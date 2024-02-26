package binarysearch;

public class KokoEatingBanana {

    int maxEle(int[] piles){
        int high=Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            high=Math.max(piles[i],high);
        }
        return high;
    }
    int calculateTotalHours(int arr[], int h){
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            k+=Math.ceil((double) arr[i]/(double) h);
        }
        return k;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxEle(piles);
        System.out.println(high);

        while(low<=high){
            int mid=(low+high)/2;
            int k=calculateTotalHours(piles,mid);
            if(k<=h){

                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        KokoEatingBanana obj = new KokoEatingBanana();
        System.out.println(obj.minEatingSpeed(new int[]{30,11,23,4,20},5));
    }
}
