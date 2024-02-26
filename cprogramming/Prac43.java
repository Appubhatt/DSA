package cprogramming;
//43 Transpose of a Matrix
public class Prac43 {
    public static void main(String[] args) {
        int m1[][]={{1,2,4},{2,5,7},{4,6,7}};
        int m2[][]=new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j]=m1[j][i];
            }
        }
        System.out.println("Matrix Transpose :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
