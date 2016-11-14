/**
 * Created by shilpa on 10/18/2016.
 */
public class BattleShips {
    public static void main(String[] args){
        char[][] arr = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
        System.out.println(countBattleships(arr));
    }

    public static int countBattleships(char[][] board) {
        if(board == null ||board.length <=0 || board[0].length <= 0 ){
            return 0;
        }
        int count = 0;
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];

        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if(board[i][j] == 'X' && visited[i][j] == false) {
                    count++;
                    visited[i][j] = true;
                    int k = i;
                    int l = j;
                    while (k + 1 < row && board[k + 1][l] == 'X') {
                        k++;
                        visited[k][l] = true;
                    }
                    k = i;
                    l = j;
                    while (l + 1 < col && board[k][l + 1] == 'X') {
                        l++;
                        visited[k][l] = true;
                    }
                }
            }
        }

        return count;
    }
}
