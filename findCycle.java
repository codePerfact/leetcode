/**
 * Created by shilpa on 1/6/2017.
 */
public class findCycle {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next  = node1;
        //node1.next = head
//        head.next.next = new ListNode(3);
//        head.next.next.next = node1;
        detectCycle(head);
    }
    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        else {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast)
                    break;
            }
            if (slow == fast) {
                ListNode start = head;
                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }
                return start;
            }else{
                return null;
            }
        }
    }
}
