/**
 * Created by shilpa on 12/25/2016.
 */
public class addinLL {
    public static void main(String[] args){
        ListNode a = new ListNode(5);


        ListNode b = new ListNode(5);


        System.out.println((addTwoNumbers(a,b)));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode revl1 = reverse(l1);
        ListNode revl2 = reverse(l2);
        ListNode result= null;
        ListNode temp = null;
        ListNode f = revl1;
        ListNode s = revl2;
        int sum;
        int carry = 0;
        int no;
        while (f != null || s != null || carry != 0){
            sum = 0;
            if (f != null){
                sum += f.val;
                f = f.next;
            }
            if(s != null){
                sum += s.val;
                s = s.next;
            }
            sum += carry;
            no = sum%10;
            carry = sum/10;
            ListNode newnode = new ListNode(no);
            if(result == null){
                result = newnode;
                temp = newnode;
            }else{
                temp.next = newnode;
                temp = temp.next;
            }

        }
        return reverse(result);
    }

    public static ListNode reverse(ListNode head){
        ListNode p1 = null;
        ListNode p2 = head;
        ListNode p3 = null;
        while (p2 != null){
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        return p1;
    }
}
