package slidingwindow;

import java.util.*;

public class MaximumOfAllSubarrayOfK {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> answer = new ArrayList<>();
        LinkedList<Integer> ansList= new LinkedList<>();
        int i=0;int j=0;
        while(j<n){
           while(ansList.size()>0 && ansList.getLast()<arr[j]){
               ansList.removeLast();
           }
           ansList.add(arr[j]);
            if (j-i+1<k){
                j++;
            } else if (j-i+1==k) {
                answer.add(ansList.getFirst());
                if(arr[i]== ansList.getFirst()){
                    ansList.removeFirst();
                }
                i++;
                j++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(max_of_subarrays(new int[]{1,2,3,1,4,5,2,3,6},9,3));
    }
}
