/**
 * Created by shilpa on 10/21/2016.
 */
public class addNum {

    public static void main(String[] args){
        ListNode L1 = new ListNode(5);
//        L1.next = new ListNode(4);
//        L1.next.next = new ListNode(3);

        ListNode L2 = new ListNode(5);
//        L2.next = new ListNode(6);
//        L2.next.next = new ListNode(4);

        addTwoNumbers(L1, L2);

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode head3 = null;
        ListNode iter = null;
        int sum;
        int no;
        int carry = 0;
        while (head1 != null && head2 != null){
            sum = head1.val + head2.val + carry;
            no = sum %10;
            carry = sum/10;
            if(head3 == null){
                head3 = new ListNode(no);
                iter = head3;
            }else{
                iter.next = new ListNode(no);
                iter = iter.next;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        while (head1 != null){
            sum = head1.val + carry;
            no = sum%10;
            carry = sum/10;
            if(head3 == null){
                head3 = new ListNode(no);
                iter = head3;
            }else{
                iter.next = new ListNode(no);
            }
            iter = iter.next;
            head1 = head1.next;
        }

        while (head2 != null){
            sum = head2.val + carry;
            no = sum%10;
            carry = sum/10;
            if(head3 == null){
                head3 = new ListNode(no);
                iter = head3;
            }else{
                iter.next = new ListNode(no);
            }
            iter = iter.next;
            head2 = head2.next;
        }

        while(carry != 0){
            iter.next = new ListNode(carry%10);
            carry = carry/10;
            iter = iter.next;
        }
        return head3;
    }
}
