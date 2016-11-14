/**
 * Created by shilpa on 9/16/2016.
 */
public class ReverseList {
    public static void main(String[] args){

    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
