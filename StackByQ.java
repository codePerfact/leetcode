import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by shilpa on 9/22/2016.
 */
public class StackByQ {

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    // Push element x onto stack.
    public void push(int x) {
        queue1.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
       if(!queue1.isEmpty()){
           while (queue1.size() > 1){
               queue2.add(queue1.poll());
           }
           queue1.poll();
           Queue<Integer> tmp = new LinkedList<>();
           tmp = queue1;
           queue1 = queue2;
           queue2 = tmp;
       }
    }

    // Get the top element.
    public int top() {
        if(!queue1.isEmpty()){
            while (queue1.size() > 1){
                queue2.add(queue1.poll());
            }
            int top =  queue1.peek();
            queue2.add(queue1.poll());
            Queue<Integer> tmp = new LinkedList<>();
            tmp = queue1;
            queue1 = queue2;
            queue2 = tmp;
            return top;
        }
        return -1;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        if(queue1.isEmpty() && queue2.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
