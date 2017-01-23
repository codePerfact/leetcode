/**
 * Created by shilpa on 1/18/2017.
 */

class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
}

public class CopyRandomList {
    public static void main(String[] args){
        RandomListNode head = new RandomListNode(-1);
        head.next = new RandomListNode(1);
        RandomListNode result = copyRandomList(head);
        System.out.println();
    }
    public static RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
            return null;
        RandomListNode start = head;
        while (start != null){
            RandomListNode temp = new RandomListNode(start.label);
            temp.next = start.next;
            start.next = temp;
            temp.random = start.random;
            start = start.next.next;
        }

        start = head;
        RandomListNode head2 = start.next;
        while (start != null){
            if(start.next.random != null)
                start.next.random = start.next.random.next;
            start = start.next.next;
        }
        start = head;
        RandomListNode newStart = head.next;
        while (start != null && newStart != null){
            start.next = newStart.next;
            if(newStart.next != null) {
                newStart.next = start.next.next;

            }
            start = start.next;
            newStart = newStart.next;
        }
        return head2;
    }
}
