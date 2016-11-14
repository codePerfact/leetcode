import java.util.PriorityQueue;

/**
 * Created by shilpa on 9/17/2016.
 */
public class CalculateCost {
    public static void main(String[] args){
        int[] arr = {1,3,4,2};
        System.out.println(reductionCost(arr));
    }
    static int reductionCost(int[] num) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<num.length; i++){
            queue.offer(num[i]);
        }
        int cost = 0;
        while (queue.size() >= 2){
            int sum = queue.poll()+queue.poll();
            cost += sum;
            queue.offer(sum);
        }
        return cost;
    }

}
