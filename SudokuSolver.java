import java.util.HashMap;

/**
 * Created by shilpa on 1/10/2017.
 */
public class SudokuSolver {
    public void solveSudoku(char[][] board) {
        _solveSudoku(board);
    }
    public boolean _solveSudoku(char[][] board){
        int[] location = new int[2];
        if(findUnassignedLocation(board,location)){
            int row = location[0];
            int col = location[1];
            for(char i='1'; i<='9'; i++){
                if(isSafe(board,i,row,col)){
                    board[row][col] = i;
                    if(_solveSudoku(board)){
                        return true;
                    }else{
                        board[row][col] = '.';
                    }
                }
            }
        }else{
            return true;
        }
        return false;
    }

    boolean findUnassignedLocation(char[][] board, int[] result){
        for(int i=0; i<9; i++){
            for(int j=0; j<0; j++){
                if(board[i][j] == '.'){
                    result[0] = i;
                    result[1] = j;
                    return true;
                }
            }
        }
        return false;
    }

    boolean isSafe(char[][] board, char i, int row, int col){
        if(colSafe(board, i, row, col) && rowSafe(board, i, row, col) && boxSafe(board, i, row, col))
            return true;
        return false;
    }

    boolean colSafe(char[][] board, char n, int row, int col){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<9; i++){
            if(map.containsKey(n)){
                return false;
            }else{
                map.put(board[i][col],1);
            }
        }
        return true;
    }
    boolean rowSafe(char[][] board, char n, int row, int col){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<9; i++){
            if(map.containsKey(n)){
                return false;
            }else{
                map.put(board[row][i],1);
            }
        }
        return true;
    }
    boolean boxSafe(char[][] board, char n, int row, int col){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = row-row%3; i<i+3; i++){
            for(int j = col-col%3; j<j+3; j++){
                if(board[i][j] == n){
                    return false;
                }

            }
        }
        return true;
    }
}
