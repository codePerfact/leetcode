/**
 * Created by shilpa on 1/13/2017.
 */
public class RotateRight {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        //head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
        //head.next.next.next.next = new ListNode(5);
        ListNode first = rotateRight(head,0);
        System.out.println();
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        int count = 0;
        ListNode temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        if(k==0)
            return head;
        k = k%count;
        ListNode first = head;
        count = k;
        while (count != 0 && first != null){
            first = first.next;
            count--;
        }
        ListNode second = head;
        while (first!= null && first.next != null){
            second = second.next;
            first = first.next;
        }
        ListNode list2 = second.next;
        second.next = null;
        ListNode list1 = head;
        list1 = reverse(list1);
        list2 = reverse(list2);
        head = list1;
        while (list1.next != null){
            list1 = list1.next;
        }
        list1.next = list2;
        return reverse(head);
    }
    public static ListNode reverse(ListNode head){
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
