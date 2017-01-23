/**
 * Created by shilpa on 1/14/2017.
 */
public class Search2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        if(r == 0){
            return false;
        }
        int c = matrix[0].length;
        int i=r-1;
        int j = 0;
        while (i>=0 && j<c){
            if(matrix[i][j] == target)
                return true;
            else if(target > matrix[i][j]){
                j++;
            }else if(target<matrix[i][j]){
                i--;
            }
        }
        return false;
    }
}
