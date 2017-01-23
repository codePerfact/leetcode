/**
 * Created by shilpa on 1/14/2017.
 */
public class reverseLinkedList {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = reverseBetween(head,1,5);
        System.out.println();
    }
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode start = head;
        ListNode prev = null;
        int count = m-1;
        while (count > 0){
            prev = start;
            start = start.next;
            count--;
        }
        count = n-m;
        ListNode newStart = start;
        while (count > 0){
            newStart = newStart.next;
            count--;
        }

        ListNode list1;
        if(prev != null){
            prev.next = null;
            list1 = head;
        }else{
            list1 = null;
        }
        ListNode list2 = start;
        ListNode list3 = newStart.next;
        newStart.next = null;
        list2 = reverse(list2);
        head = list1;
        while (list1 != null && list1.next != null){
            list1= list1.next;
        }
        if(list1 != null) {
            list1.next = list2;
        }else{
            list1 = list2;
            head = list2;
        }
        while (list1 != null && list1.next != null){
            list1 = list1.next;
        }
        if(list1 != null) {
            list1.next = list3;
        }else{
            list1 = list3;
            head = list3;
        }
        return head;
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
