/**
 * Created by shilpa on 9/23/2016.
 */
public class IntersectLists {
    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        ListNode n2 = n1;
        getIntersectionNode(n1,n2);

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n = 0;
        int m = 0;
        ListNode startA = headA;
        ListNode startB = headB;
        if(headA == null || headB == null){
            return null;
        }else{
            while (startA != null){
                n++;
                startA = startA.next;
            }

            while (startB != null){
                m++;
                startB = startB.next;
            }

//            int diff = n>m ? n-m : m-n;
            startB = headB;
            startA = headA;
            if(n>m){
                int diff = n-m;
                while (startA != null && diff > 0){
                    startA = startA.next;
                    diff--;
                }
            }else if(m>n){
                int diff = m-n;
                while (startB != null && diff > 0){
                    startB = startB.next;
                    diff--;
                }
            }

            while (startA != null && startB != null){
                if(startA == startB){
                    return startA;
                }else{
                    startA = startA.next;
                    startB = startB.next;
                }

            }
            return null;
        }
    }
}
