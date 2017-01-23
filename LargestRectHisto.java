import java.util.Stack;

/**
 * Created by shilpa on 1/14/2017.
 */
public class LargestRectHisto {
    public static void main(String[] agrs){
        int[] arr = {1};
        System.out.println(largestRectangleArea(arr));
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
