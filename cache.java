import org.omg.CORBA.MARSHAL;

import java.util.HashMap;

/**
 * Created by shilpa on 12/23/2016.
 */
public class cache {
    private int capacity;
    private doublyListNode head;
    HashMap<Integer, doublyListNode> map = null;
    public cache(int capacity) {
        this.capacity = capacity;
        this.head = null;
        this.map = new HashMap<>();
    }

    public int get(int key) {
        if (map.containsKey(key)){
            doublyListNode curr = map.get(key);

            if(curr.prev == null){
                return curr.value;
            }else if(curr.next == null){
                curr.prev.next = curr.next;
                curr.prev = null;
            }else{
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                curr.next = null;
                curr.prev = null;
            }
            curr.next = this.head;
            head.prev = curr;
            head = curr;
            return head.value;
        }else {
            return -1;
        }
    }

    public void set(int key, int value) {
        if(map.containsKey(key)){
            map.get(key).value = value;
            return;
        }else if(this.map.size() >= this.capacity) {
            doublyListNode temp = head;
            while (temp != null && temp.next != null) {
                temp = temp.next;
            }
            for(int k : map.keySet()){
                if (map.get(k) == temp){
                    map.remove(k);
                    break;
                }
            }
            if (temp != null && temp.next == null) {
                temp.prev.next = null;
                temp.prev = null;
            }
        }
        doublyListNode newNode = new doublyListNode(value);
        if(head == null){
            head = newNode;
            map.put(key,head);
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            map.put(key,head);
        }

    }
}
