package cprogramming;
//41 Matrix Subtraction
public class Prac41 {
    public static void main(String[] args) {
        int m1[][]={{1,2,4},{2,5,7},{4,6,7}};
        int m2[][]={{2,4,3},{2,1,4},{5,3,6}};

        int[][] m3 = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m3[i][j]=m1[i][j]-m2[i][j];
            }
        }
        System.out.println("Answer:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
