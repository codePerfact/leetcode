import com.sun.deploy.util.ArrayUtil;

import java.util.*;

/**
 * Created by shilpa on 12/15/2016.
 */
public class sample2 {

    public static void main(String[] args){
        int[] arr = {2,5,4,6,8};
        segment(3,arr);
    }

    static int segment(int x, int[] arr) {
        Deque<Integer> deque = new ArrayDeque<Integer>(x);
        ArrayList<Integer> B = new ArrayList<Integer>();
        int i;
        for(i = 0; i<x; i++){
            while (!deque.isEmpty() && arr[i] < arr[deque.getLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }

        for (;i<arr.length; ++i) {
            B.add(arr[deque.getFirst()]);
            while (!deque.isEmpty() && deque.getFirst() <= i - x) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && arr[i] < arr[deque.getLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        B.add(arr[deque.getFirst()]);
        return Collections.max(B);
        }
}
