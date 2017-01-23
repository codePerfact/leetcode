import java.util.HashMap;
import java.util.List;

/**
 * Created by shilpa on 1/14/2017.
 */
public class deleteDuplicates {
    static HashMap<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        ListNode result = deleteDuplicates(head);
        System.out.println();
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        head = _deleteDuplicates(head);
        ListNode start = head;
        ListNode prev = null;
        while (start != null){
            if(map.containsKey(start.val)){
                if(prev == null){
                    head = head.next;
                    start = start.next;
                }else{
                    prev.next = start.next;
                    start = prev.next;
                }
            }else{
                prev = start;
                start = start.next;
            }
        }
        return head;
    }

    public static ListNode _deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode start = head;
        while (head != null && head.next != null){
            if(head.val == head.next.val){
                map.put(head.val,1);
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return start;
    }
}
