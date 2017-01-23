/**
 * Created by shilpa on 1/6/2017.
 */
public class PartitionList {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        partition(head,3);
    }
    public static ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)
            return head;
        ListNode head1 = null;
        ListNode iter1 = head1;
        ListNode head2 = null;
        ListNode iter2 = head2;
        ListNode curr = head;
        while (curr != null){
            if(curr.val < x){
                ListNode t = new ListNode(curr.val);
                if(head1 == null){
                    head1 = t;
                    iter1 = head1;
                }else{
                    iter1.next = t;
                    iter1 = iter1.next;
                }
            }else{
                ListNode t = new ListNode(curr.val);
                if(head2 == null){
                    head2 = t;
                    iter2 = head2;
                }else{
                    iter2.next = t;
                    iter2 = iter2.next;
                }
            }
            curr = curr.next;
        }
        if(iter1 != null)
            iter1.next = head2;
        else
            head1 = head2;
        return head1;
    }
}
