/**
 * Created by shilpa on 1/9/2017.
 */
public class SwapPairs {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        swapPairs(head);
    }
    public static ListNode swapPairs(ListNode head) {
        ListNode first = head;
        if(first == null || first.next == null)
            return first;

        while (first != null && first.next != null){
            int temp = first.val;
            first.val = first.next.val;
            first.next.val = temp;
            first = first.next.next;
        }
        return head;
    }
}
