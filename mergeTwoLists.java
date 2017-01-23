/**
 * Created by shilpa on 1/6/2017.
 */
public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;
        else{
            ListNode head = null;
            ListNode curr = head;
            while (l1 != null || l2 != null){
                ListNode temp = null;
                if(l1 != null && l2 != null){
                    if(l1.val <= l2.val) {
                        temp = l1;
                        l1 = l1.next;
                    }else{
                        temp = l2;
                        l2 = l2.next;
                    }
                }else if(l1 != null){
                    temp = l1;
                    l1 = l1.next;
                }else{
                    temp = l2;
                    l2 = l2.next;
                }
                temp.next = null;
                if(curr == null){
                    head = temp;
                    curr = head;
                }else{
                    curr.next = temp;
                    curr = curr.next;
                }
            }
            return head;
        }
    }
}
