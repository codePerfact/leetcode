import java.util.Stack;

/**
 * Created by shilpa on 1/8/2017.
 */
public class ContainerWithMostWater {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int j=height.length-1,i=0,mx=0;

        while(i<j)
        {
            mx=Math.max(mx,((j-i)*(Math.min(height[i],height[j]))));

            if(height[i]<height[j])
                i++;
            else if(height[i]>=height[j])
                j--;
        }
        return mx;
    }
}
