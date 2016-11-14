/**
 * Created by shilpa on 9/20/2016.
 */
public class removeNthFromEnd {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);
        node1.next.next.next.next = new ListNode(5);
        removeNthFromEnd(node1,2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }

        ListNode first = head;
        int count = n;
        while (count > 0 && first != null && first.next != null){
            first = first.next;
            count--;
        }

        if(count > 0){
            head = head.next;
            return head;
        }
        ListNode second = head;

        if(first.next == null){
            if(count > 0){
                second = second.next;
                count--;
            }
        }
        while (first.next != null){
            second = second.next;
            first = first.next;
        }

        second.next = second.next.next;
        return head;
    }
}
