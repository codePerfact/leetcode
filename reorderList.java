import java.util.List;

/**
 * Created by shilpa on 1/19/2017.
 */
public class reorderList {
    public static void main(String[] agrs){
        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
        reorderList(head);
        System.out.println();
    }
    public static void reorderList(ListNode head) {
        if(head == null)
            return;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head1 = head;
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);

        ListNode start1 = head1;
        ListNode start2 = head2;
        ListNode temp;
        while (start2 != null){
            temp = start2;
            start2 = start2.next;
            temp.next = start1.next;
            start1.next = temp;
            start1 = start1.next.next;
        }
    }

    public static ListNode reverse(ListNode head){
        if(head == null)
            return null;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
