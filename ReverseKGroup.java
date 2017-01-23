import java.util.Stack;

/**
 * Created by shilpa on 1/9/2017.
 */
public class ReverseKGroup {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        ListNode result = reverseKGroup(head,1);
        System.out.println();
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        Stack<Integer> stack = new Stack<>();
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        while (head != null){
            int count = k;
            while (count != 0){
                if(stack.size() < k && head != null) {
                    stack.push(head.val);
                    head = head.next;
                    count--;
                }
                if(stack.size() == k){
                    while (!stack.isEmpty()){
                        curr.next = new ListNode(stack.pop());
                        curr = curr.next;
                    }
                    break;
                }else if(head == null && stack.size() < k){
                    Stack<Integer> temp = new Stack<>();
                    while (!stack.isEmpty()){
                        temp.push(stack.pop());
                    }
                    while (!temp.isEmpty()){
                        curr.next = new ListNode(temp.pop());
                        curr = curr.next;
                    }
                    break;
                }
            }
        }
        return result.next;
    }
}
