package recursion;

import java.util.ArrayList;

public class RatInAMaze {

    static void solve(int i,int j,int[][]m,int n,ArrayList<String> ans,String move,int[][] visited){
        if(i==n-1 && j == n-1){
            ans.add(move);
            return;
        }

        //Down
        if(i+1<n && visited[i+1][j]==0 && m[i+1][j]==1){
            visited[i][j]=1;
            solve(i+1, j, m, n, ans, move+"D", visited);
            visited[i][j]=0;
        }

        ////Left
        if(j-1>=0 && visited[i][j-1]==0 && m[i][j-1]==1){
            visited[i][j]=1;
            solve(i, j-1, m, n, ans, move+"L", visited);
            visited[i][j]=0;
        }

        //right
        if(j+1<n && visited[i][j+1]==0 && m[i][j+1]==1){
            visited[i][j]=1;
            solve(i, j+1, m, n, ans, move+"R", visited);
            visited[i][j]=0;
        }

        //Up
        if(i-1>=0 && visited[i-1][j]==0 && m[i-1][j]==1){
            visited[i][j]=1;
            solve(i-1, j, m, n, ans, move+"U", visited);
            visited[i][j]=0;
        }
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        int[][] visited = new int[n][n];

        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                visited[i][j]=0;
            }
        }
        if(m[0][0]==1){
            solve(0,0,m,n,ans,"",visited);
        }

        return ans;
    }

    public static void main(String[] args) {
       int m[][] = {{1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}};
       int n=4;
        System.out.println(findPath(m,n));
    }
}
