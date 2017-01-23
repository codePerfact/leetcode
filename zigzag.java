import java.util.Arrays;

/**
 * Created by shilpa on 1/7/2017.
 */
public class zigzag {
    public static void main(String[] args){
        System.out.println(convert("A",1));
    }
    public static String convert(String s, int numRows) {
        int cols = 0;
        int i = 0;
        if(numRows == 1){
            return s;
        }
        while (i< s.length()){
            i = i+numRows+numRows-2;
            cols = cols+1+numRows-2;
        }
        Character[][] matrix = new Character[numRows][cols];
        for(int k = 0; k<numRows; k++){
            Arrays.fill(matrix[k],'#');
        }
        int r = 0;
        int c = 0;
        boolean dir = true;
        for(int j=0; j<s.length(); j++){
            matrix[r][c] = s.charAt(j);
            if(r == 0){
                dir = true;
                r++;
            }else if (r == numRows -1){
                dir = false;
                r--;
                c++;
            }else if(dir){
                r++;
            }else if(!dir){
                r--;
                c++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<numRows; j++){
            for(int k = 0; k<cols; k++){
                if(matrix[j][k] != '#'){
                    sb.append(matrix[j][k]);
                }
            }
        }
        return sb.toString();
    }
}
