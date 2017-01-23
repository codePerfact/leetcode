/**
 * Created by shilpa on 1/14/2017.
 */
public class WordSearch {
    public static void main(String[] args){
        char[] arr1 = {'A','B','C','E'};
        char[] arr2 = {'S','F','C','S'};
        char[] arr3 = {'A','D','E','E'};
        char[][] matrix = new char[3][4];
        matrix[0] = arr1;
        matrix[1] = arr2;
        matrix[2] = arr3;
        System.out.println(exist(matrix,"ABCB"));
    }
    public static boolean exist(char[][] board, String word) {
        int row = board.length;
        if(row == 0)
            return false;
        int col = board[0].length;
        boolean result = false;
        for(int i=0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                if(board[i][j] == word.charAt(0)){
                    boolean[][] visited = new boolean[row][col];
                    result = result || search(board,i,j,word,visited);
                }
            }
        }
        return result;
    }
    public static boolean search(char[][] board, int r, int c, String target, boolean[][] visited){
        if(target.length() == 0){
            return true;
        }else if(r <0 || r >= board.length){
            return false;
        }else if(c < 0 || c >=board[0].length){
            return false;
        }else if(board[r][c] == target.charAt(0) && visited[r][c] == false){
            visited[r][c] = true;
            boolean result =  search(board, r+1,c,target.substring(1),visited) || search(board, r,c+1,target.substring(1),visited)
                    || search(board, r-1,c,target.substring(1),visited) || search(board, r,c-1,target.substring(1),visited);
            visited[r][c] = false;
            return result;
        }
        return false;
    }
}
