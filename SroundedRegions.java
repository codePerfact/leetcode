import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by shilpa on 1/18/2017.
 */
class position{
    int R;
    int C;
    public position(int r, int c){
        this.R = r;
        this.C = c;
    }
}
public class SroundedRegions {

    static int r;
    static int c;
    static char[][] globalboard;
    static boolean[][] globalvisited;
    public static void main(String[] args){
        char[] arr1 = {'O','O','O'};
        char[] arr2 = {'O','O','O'};
        char[] arr3 = {'O','O','O'};
     //  char[] arr4 = {'X','O','X','X'};
        char[][] arr = new char[3][3];
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;
        //arr[3] = arr4;
        solve(arr);
        System.out.println();
    }

    public static void solve(char[][] board) {
        int row = board.length;
        if(row <= 2){
            return;
        }
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        r = row;
        c = col;
        globalboard = board;
        globalvisited = visited;
        for(int i=0; i<col; i++){
            if(globalboard[0][i] == 'O' && globalvisited[0][i] == false)
                dfs(0,i);
        }
        for(int i=1; i<row; i++){
            if(globalboard[i][col-1] == 'O' && globalvisited[i][col-1] == false){
                dfs(i,col-1);
            }
        }
        for(int i=col-2; i>=0; i--){
            if(globalboard[row-1][i] == 'O' && globalvisited[row-1][i] == false){
                dfs(row-1, i);
            }
        }
        for(int i=row-2; i>=0; i--){
            if(globalboard[i][0] == 'O' && globalvisited[i][0] == false){
                dfs(i,0);
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(globalboard[i][j] == 'O' && globalvisited[i][j] == false){
                    globalboard[i][j] = 'X';
                }
            }
        }
    }

    public static void dfs(int startr, int startc){
        Queue<position> queue = new LinkedList<>();
        queue.add(new position(startr,startc));
        while (!queue.isEmpty()){
            position top = queue.remove();
            if(top.R < 0 || top.R >= r)
                continue;
            if(top.C < 0 || top.C >=c)
                continue;
            if(globalboard[top.R][top.C] == 'O' && globalvisited[top.R][top.C] == false){
                globalvisited[top.R][top.C] = true;
                queue.add(new position(top.R+1,top.C));
                queue.add(new position(top.R-1,top.C));
                queue.add(new position(top.R,top.C+1));
                queue.add(new position(top.R,top.C-1));
            }
        }
    }
}
