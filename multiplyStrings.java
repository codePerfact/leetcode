import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by shilpa on 1/12/2017.
 */
public class multiplyStrings {
    public static void main(String[] agrs){
        System.out.println(multiply("0","0"));
    }
    public static String multiply(String num1, String num2) {
        if(num1 == "0" || num2 == "0")
            return "0";
        int row = num2.length();
        int col = num1.length()+num2.length()+1;
        int[][] matrix = new int[row][col];
        for(int i=0; i<row; i++) {
            Arrays.fill(matrix[i], 0);
        }
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        int r = 0;
        int c = col-1;
        for(int i=n2.length-1; i>=0; i--){
            c = col-1-r;
            int carry = 0;
            for(int j=n1.length-1; j>=0; j--){
                int n = (n1[j]-'0')*(n2[i]-'0');
                n += carry;
                carry = n/10;
                matrix[r][c] = n%10;
                c--;
            }
            while(carry != 0){
                matrix[r][c] = carry%10;
                carry = carry/10;
                c--;
            }
            r++;
        }

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int sum = 0;
        for(int i=col-1; i>=0; i--){
            sum = 0;
            sum += carry;
            for(int j=0; j<row; j++){
                sum += matrix[j][i];
            }
            carry = sum/10;
            sb.append(sum%10);
        }
        while (carry != 0){
            sb.append(carry%10);
            carry = carry/10;
        }

        sb.reverse();
        while (sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        if(sb.length() == 0)
            return "0";
        else
            return sb.toString();
    }

    public static void reverse(char[] arr){
        int start = 0;
        int end = arr.length-1;
        char temp;
        while (start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
