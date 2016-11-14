import java.util.Stack;

/**
 * Created by shilpa on 9/19/2016.
 */
public class QueueUsingStacks {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public static void main(String[] args){

    }

    public void push(int x) {
        if(stack1.empty()){
            stack1.push(x);
        }else{
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            while (!stack2.empty()){
                stack1.push(stack2.pop());
            }
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(!stack1.empty()){
            stack1.pop();
        }
    }

    // Get the front element.
    public int peek() {
        if(!stack1.empty()){
            return stack1.peek();
        }
        return -1;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.empty();
    }
}
