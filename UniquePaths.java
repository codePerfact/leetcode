/**
 * Created by shilpa on 1/13/2017.
 */
public class UniquePaths {
    static int count = 0;
    public static void main(String[] args){
        //System.out.println(uniquePaths(3,7));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if(m <= 0)
            return 1;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1] == 1 || obstacleGrid[0][0] == 1)
            return 0;
        return uniquePaths(m,n,obstacleGrid);
    }
    public static int uniquePaths(int m, int n, int[][] obstacleGrid) {
        int[][] matrix = new  int[m][n];
        matrix[m-1][n-1] =  1;
        for(int i=n-2; i>=0; i--){
            if(obstacleGrid[m-1][i] == 1){
                matrix[m-1][i] = 0;
            }else {
                matrix[m - 1][i] = matrix[m-1][i+1];
            }
        }
        for(int i=m-2; i>=0; i--){
            if(obstacleGrid[i][n-1] == 1){
                matrix[i][n-1] = 0;
            }else{
                matrix[i][n-1] = matrix[i+1][n-1];
            }
        }
        for(int i=m-2; i>=0; i--){
            for(int j=n-2; j>=0; j--){
                if(obstacleGrid[i][j] == 1){
                    matrix[i][j] = 0;
                }else{
                    matrix[i][j] = matrix[i+1][j]+matrix[i][j+1];
                }
            }
        }
        return matrix[0][0];
    }
}
