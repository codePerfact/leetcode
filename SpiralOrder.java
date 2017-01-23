import java.util.ArrayList;
import java.util.List;

/**
 * Created by shilpa on 1/12/2017.
 */
public class SpiralOrder {
    public static void main(String[] args){
        int[][] result = spiralOrder(3);
        System.out.println();
    }
    public static int[][] spiralOrder(int n) {
        if (n==0){
            return new int[0][0];
        }
        int[][] matrix = new int[n][n];
        int row = n;
        int col = n;
        int left = 0;
        int right = col-1;
        int top = 0;
        int bottom = row-1;
        int count = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                count++;
            }
        }
        int c = 1;
        int i=0;
        int j = 0;
        int dir = 1;
        while (count != 0){
            if(dir == 1){
                for(int k = left; k<=right; k++){
                    matrix[top][k] = c++;
                    count--;
                }
                top++;
                dir=2;
            }else if(dir == 2){
                for(int k=top; k<=bottom; k++){
                    matrix[k][right] = c++;
                    count--;
                }
                right--;
                dir = 3;
            }else if(dir == 3){
                for(int k=right; k>=left; k--){
                    matrix[bottom][k] = c++;
                    count--;
                }
                bottom--;
                dir = 4;
            }else if(dir == 4){
                for(int k=bottom; k>=top; k--){
                    matrix[k][left] = c++;
                    count--;
                }
                left++;
                dir = 1;
            }
        }
        return matrix;
    }
}
