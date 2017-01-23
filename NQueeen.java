import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shilpa on 1/12/2017.
 */
public class NQueeen {
    static int result = 0;
    public static void main(String[] args){
        System.out.println(solveNQueens(8));

    }
    public static int solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(board[i],'.');
        }
        _solveNQueens(board,0,n);
        return result;
    }
    public static void  _solveNQueens(char[][] board, int col, int n){
        if(col >= n){
            result++;
        }else {
            for (int i = 0; i < n; i++) {
                if (isSafe(board, i, col, n)) {
                    board[i][col] = 'Q';
                    _solveNQueens(board, col + 1, n);
                    board[i][col] = '.';
                }
            }
        }
    }

    static List<String> ConvertBoard(char[][] board, int n){
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.setLength(0);
            for(int j=0; j<n; j++){
                sb.append(board[i][j]);
            }
            result.add(sb.toString());
        }
        return result;
    }

    static boolean isSafe(char[][] board, int row, int col, int n) {
        for(int i=col; i>=0; i--){
                if(board[row][i] == 'Q'){
                    return false;
                }
        }
        for(int i=row,j=col; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q')
                return false;
        }
        for(int i=row,j=col; i<n && j>=0; i++,j--){
            if(board[i][j] == 'Q')
                return false;
        }
        return true;
    }
}
