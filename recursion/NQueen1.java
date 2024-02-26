package recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueen1 {
     public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        dfs(0,board,ans);
        return ans;
    }
    void dfs(int col,char[][] board,List<List<String>> ans){
        if(col==board.length){
            ans.add(construct(board));
            return;
        }
        for(int row=0;row< board.length;row++){
            if(validate(board,row,col)){
                board[row][col]='Q';
                dfs(col+1,board,ans);
                board[row][col]='.';
            }
        }
    }

    boolean validate(char[][] board, int row, int col) {
        int duprow = row;
        int dupcol = col;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        row=duprow;
        col=dupcol;
        while(col>=0){
            if(board[row][col]=='Q') return false;
            col--;
        }
        row=duprow;
        col=dupcol;
        while(col>=0 && row< board.length){
            if(board[row][col]=='Q') return false;
            col--;
            row++;
        }
        return true;
    }

    List<String> construct(char[][] board){
        List<String> str = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            str.add(s);
        }
        return str;
    }

    public static void main(String[] args) {
        int N=4;
        NQueen1 obj = new NQueen1();
        List<List<String>> queen = obj.solveNQueens(4);
        int i=1;
        for(List<String> it:queen){
            System.out.println("Arrangement:"+i);
            for(String s:it){
                System.out.println(s);
            }
            System.out.println();
            i+=1;
        }
    }
}
