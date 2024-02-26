package cprogramming;
//45 Check Lower Triangular Matrix
public class Prac45 {

    static int n=4;
    private static boolean isLowerTriangularMatrix(int[][] m1) {

        for (int i = 0; i < n-1; i++){
            for (int j = i + 1; j < n; j++){
                if (m1[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 0, 0, 0 },
                { 1, 4, 0, 0 },
                { 4, 6, 2, 0 },
                { 0, 4, 7, 6 } };

        // Function call
        if (isLowerTriangularMatrix(mat))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
