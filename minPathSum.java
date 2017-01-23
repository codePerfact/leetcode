/**
 * Created by shilpa on 1/13/2017.
 */
public class minPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        if(row <=0)
            return 1;
        int col = grid[0].length;
        int[][] matrix = new int[row][col];
        matrix[row-1][col-1] = grid[row-1][col-1];
        for(int i=col-2; i>=0; i--){
            matrix[row-1][i] = matrix[row-1][i+1] + grid[row-1][i];
        }
        for(int i=row-2; i>=0; i--){
            matrix[i][col-1] = matrix[i+1][col-1] + grid[i][col-1];
        }
        for(int i=row-2; i>=0; i--){
            for(int j=col-2; j>=0; j--){
                matrix[i][j] = grid[i][j] + Math.min(matrix[i+1][j],matrix[i][j+1]);
            }
        }
        return matrix[0][0];
    }
}
