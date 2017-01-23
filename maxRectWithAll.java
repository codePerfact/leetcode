import java.util.Stack;

/**
 * Created by shilpa on 1/14/2017.
 */
public class maxRectWithAll {
    public static void main(String[] args){
        char[] arr1 = {'1','0','1','0','0'};
        char[] arr2 = {'1','0','1','1','1'};
        char[] arr3 = {'1','1','1','1','1'};
        char[] arr4 = {'1','0','0','1','0'};
        char[][] arr = new char[4][5];
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;
        arr[3] = arr4;
        System.out.println(maximalRectangle(arr));
    }
    public static int maximalRectangle(char[][] matrix) {
        int r = matrix.length;
        if(r == 0)
            return 0;
        int c = matrix[0].length;
        int[] mem = new int[c];
        for(int i=0; i<c; i++){
            mem[i] = matrix[0][i] - '0';
        }
        int maxArea = largestRectangleArea(mem);
        int tempMaxArea = maxArea;
        for(int i=1; i<r; i++){
            for(int j=0; j<c; j++){
                if(matrix[i][j] == '0')
                    mem[j] = 0;
                else{
                    mem[j] += (matrix[i][j] - '0');
                }
            }
            tempMaxArea = largestRectangleArea(mem);
            if(tempMaxArea > maxArea)
                maxArea = tempMaxArea;
        }
        return maxArea;
    }


    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxRectangle = 0;
        int tempRectangle = 0;
        int i;
        for(i=0; i<heights.length;){
            if(stack.isEmpty()){
                stack.push(i++);
            }else{
                if(heights[stack.peek()] <= heights[i]){
                    stack.push(i++);
                }else{
                    int lastInd = stack.pop();
                    if(!stack.isEmpty()){
                        tempRectangle = heights[lastInd]*(i-stack.peek()-1);
                    }else{
                        tempRectangle = heights[lastInd]*(i);
                    }
                    if(tempRectangle > maxRectangle)
                        maxRectangle = tempRectangle;
                }
            }
        }
        while (!stack.isEmpty()){
            int top = stack.pop();
            if(stack.isEmpty()){
                tempRectangle = heights[top]*i;
            }else{
                tempRectangle = heights[top]*(i-stack.peek()-1);
            }
            if(tempRectangle > maxRectangle)
                maxRectangle = tempRectangle;
        }
        return maxRectangle;
    }
}
