import java.util.HashMap;

/**
 * Created by shilpa on 8/24/2016.
 */
public class LruImp {
    public int capacity;
    public int currSize;
    HashMap<Integer, doubllyLinkList> map = new HashMap<>();
    doubllyLinkList  first = null;
    doubllyLinkList rear = null;
    public LruImp(int capacity){
        this.capacity = capacity;
    }

    public void set(int key, int value){
        if(first == null && rear == null){
            doubllyLinkList node = new doubllyLinkList(value);
            map.put(key, node);
            first = node;
            rear = node;
            currSize++;
        }else if(map.containsKey(key)){
            doubllyLinkList currNode = map.get(key);
            currNode.value = value;
            if(currNode.next == null){
                rear = rear.prev;
                rear.next = null;
            }else if (currNode.next != null && currNode.prev != null){
                currNode.prev.next = currNode.next;
                currNode.next.prev = currNode.prev;
                currNode.next = null;
                currNode.prev = null;
            }
            if(currNode != first){
                currNode.next = first;
                first.prev = currNode;
                first = currNode;
            }
        }else{
            doubllyLinkList currNode = new doubllyLinkList(value);
            map.values().remove(rear);
            map.put(key, currNode);
            currNode.next = first;
            first.prev = currNode;
            first = currNode;
            currSize++;
        }

        if (currSize > capacity){
            rear = rear.prev;
            rear.next = null;
        }
    }
}
