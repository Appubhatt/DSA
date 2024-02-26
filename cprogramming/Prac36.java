package cprogramming;
//36 Linear Search
public class Prac36 {
    public static void main(String[] args) {
        int[] arr={1,43,765,8,5,2,54,7,9};
        int key=8;
        for (int i = 0; i < arr.length; i++) {
            if(key==arr[i]){
                System.out.println("Element found");
                System.exit(0);
            }
        }
        System.out.println("Element not found");
    }
}
