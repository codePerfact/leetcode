/**
 * Created by shilpa on 1/19/2017.
 */
public class SortLinkedList {
    public static void main(String[] args){
        ListNode head = new ListNode(2);
        head.next = new ListNode(3);
        ListNode result = insertionSortList(head);
        System.out.println();
    }
    public static ListNode insertionSortList(ListNode head) {
        ListNode start = head;
        ListNode result = new ListNode(Integer.MIN_VALUE);
        ListNode temp1;
        ListNode temp2;
        while (start != null){
                temp1 = result;
                while (temp1.next != null && temp1.next.val < start.val){
                    temp1 = temp1.next;
                }
                temp2 = start;
                start= start.next;
                temp2.next = temp1.next;
                temp1.next = temp2;
            }
            return result.next;
    }
}
