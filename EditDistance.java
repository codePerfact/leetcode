/**
 * Created by shilpa on 1/14/2017.
 */
public class EditDistance {
    public static void main(String[] args){
        System.out.println(minDistance("a","ab"));
    }
    public static int minDistance(String word1, String word2) {
        int[][] matrix = new int[word2.length()+1][word1.length()+1];
        matrix[0][0] = 0;
        for(int i=1; i<=word1.length();i++){
            matrix[0][i] = i;
        }
        for (int i=1; i<=word2.length(); i++){
            matrix[i][0] = i;
        }
        for(int i=1; i<=word1.length();i++){
            for(int j=1; j<=word2.length(); j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    matrix[j][i] = matrix[j-1][i-1];
                }else{
                    int min = Math.min(matrix[j-1][i],matrix[j][i-1]);
                    matrix[j][i] = Math.min(min,matrix[j-1][i-1])+1;
                }
            }
        }
        return matrix[word2.length()][word1.length()];
    }
}
