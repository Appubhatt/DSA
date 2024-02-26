package cprogramming;
//44 Check Upper Triangular Matrix
public class Prac44 {
    static int n=4;
    static Boolean isUpperTriangularMatrix(int[][] m1){
        for (int i = 1; i < n ; i++) {
            for (int j = 0; j < i; j++) {
                if (m1[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] m1= { { 1, 3, 5, 3 }, { 0, 4, 6, 2 },{ 0, 0, 2, 0 },{ 0, 0, 0, 0 } };
        if(isUpperTriangularMatrix(m1)){
            System.out.println("Yes it is");
        }else {
            System.out.println("No it is not");
        }
    }
}
