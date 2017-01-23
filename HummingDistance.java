import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by shilpa on 12/29/2016.
 */
public class HummingDistance {
    public static void main(String[] args){

    }
    public String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j] == 1){
                    if(!(0<=i-1 && i-1<r) || grid[i-1][j] == 0 ){
                      count++;
                    }
                    if(!(0<=j-1 && j-1<c) || grid[i][j-1] == 0 ){
                        count++;
                    }
                    if(!(0<=i+1 && i+1<r) && grid[i+1][j] == 0 ){
                        count++;
                    }
                    if(!(0<=j+1 && j+1<c) && grid[i][j+1] == 0 ){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
