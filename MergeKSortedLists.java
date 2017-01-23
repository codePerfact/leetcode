import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

/**
 * Created by shilpa on 1/9/2017.
 */
public class MergeKSortedLists {
    public static void main(String[] args){
        ListNode node = new ListNode(1);
        ListNode[] arr = new ListNode[1];
        arr[0] = node;
        mergeKLists(arr);
    }
    public static ListNode mergeKLists(ListNode[] lists){
        TreeMap<Integer,Integer> map = new TreeMap<>();
        if (lists == null)
            return null;
        if (lists.length <= 0)
            return null;
        for(int i=0; i<lists.length; i++){
            ListNode head = lists[i];
            while (head != null){
                if (map.containsKey(head.val)){
                    map.put(head.val,map.get(head.val)+1);
                }else{
                    map.put(head.val,1);
                }
                head = head.next;
            }
        }
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        for(int key : map.keySet()){
            int val = key;
            int count = map.get(key);
            while (count != 0){
                curr.next = new ListNode(val);
                curr = curr.next;
                count--;
            }
        }
        return result.next;
    }


    public static ListNode mergeKListstemp(ListNode[] lists) {
        if (lists == null)
            return null;
        if (lists.length <= 0)
            return null;
        ArrayList<ListNode> myList = new ArrayList<>();
        for(int i=0; i<lists.length; i++){
            myList.add(lists[i]);
        }
        ListNode head = null;
        ListNode curr = null;
        boolean flag = true;
        while (flag) {
            flag = false;
            ListNode min = new ListNode(Integer.MAX_VALUE);
            int minIndex = -1;
            int i=0;
            while (i<myList.size()){
                if (myList.get(i) != null) {
                    flag = true;
                    if (myList.get(i).val < min.val) {
                        min = myList.get(i);
                        minIndex = i;
                    }
                    i++;
                }else{
                    myList.remove(i);
                }
            }
            if(minIndex >= 0) {
                if (head == null) {
                    head = myList.get(minIndex);
                    curr = head;
                    myList.set(minIndex,myList.get(minIndex).next);
                    curr.next = null;
                } else {
                    curr.next = myList.get(minIndex);
                    myList.set(minIndex,myList.get(minIndex).next);
                    curr = curr.next;
                    curr.next = null;
                }
            }
        }
        return head;
    }
}
