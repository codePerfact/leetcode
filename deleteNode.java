/**
 * Created by shilpa on 9/15/2016.
 */
public class deleteNode {
    public static void main(String[] args){

    }

    public void deleteNode(ListNode node) {
        int temp = node.next.val;
        node.next.val = node.val;
        node.val = temp;
        node.next = node.next.next;
    }
}
