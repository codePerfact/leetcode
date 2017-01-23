/**
 * Created by shilpa on 1/11/2017.
 */
public class rorateny90 {
    public static void main(String[] args){
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};
        int[][] matrix = new int[3][3];
        matrix[0] = arr1;
        matrix[1] = arr2;
        matrix[2] = arr3;
        rotate(matrix);
        System.out.println();
    }
    public  static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0,j=n-1; i<j; i++,j--){
            for(int k=0; k<n; k++){
                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;
            }
        }
    }
}
