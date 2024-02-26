package binarysearch;

public class BookAllocationProblem {

    public static int findPages(int[]A,int N,int M)
    {
        if(M>N) return -1;
        //Your code here
        int low=findMax(A);
        int high=SumOf(A);

        while(low<=high){

            int mid = (low+high)/2;
            int totalStudents=calculatePages(A,mid);
            if (totalStudents>M){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return low;
    }

    private static int calculatePages(int[] a, int mid) {
        int stud=1;
        int pages=0;
        for (int i = 0; i < a.length; i++) {
            if(pages+a[i]<=mid){
                pages+=a[i];
            }else {
                stud++;
                pages=a[i];
            }
        }
        return stud;
    }

    private static int SumOf(int[] a) {
        int sum=0;
        for(int n:a){
            sum+=n;
        }
        return sum;
    }

    private static int findMax(int[] a) {
        int max=0;
        for(int n:a){
            max=Math.max(max,n);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(BookAllocationProblem.findPages(new int[]{12,34,67,90},4,2));
    }
}
