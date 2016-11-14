/**
 * Created by shilpa on 9/16/2016.
 */
public class RemoveDuplicate {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
        deleteDuplicates(node1);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode start = head;
        if(head == null){
            return head;
        }
        while (head != null && head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return start;
    }
}
