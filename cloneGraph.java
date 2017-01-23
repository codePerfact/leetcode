import java.util.*;

/**
 * Created by shilpa on 1/18/2017.
 */

class UndirectedGraphNode {
      int label;
      List<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
}


public class cloneGraph {

    public static void main(String[] args){
        UndirectedGraphNode node = new UndirectedGraphNode(2);
        node.neighbors.add(node);
        UndirectedGraphNode copy = cloneGraph(node);
        System.out.println();
    }


    public static UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null)
            return null;
        HashMap<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<>();
        bfs_makeclone(node,map);
        bfs_connect(node,map);
        return map.get(node);
    }

     public static void bfs_connect(UndirectedGraphNode node, HashMap<UndirectedGraphNode,UndirectedGraphNode> map){
         HashMap<UndirectedGraphNode,UndirectedGraphNode> newMap = new HashMap<>(map);
         Queue<UndirectedGraphNode> queue = new LinkedList<>();
         queue.add(node);
         newMap.remove(node);
         while (!queue.isEmpty()){
             UndirectedGraphNode top = queue.remove();
             UndirectedGraphNode clone = map.get(top);
             for(UndirectedGraphNode neighbour : top.neighbors){
                 clone.neighbors.add(map.get(neighbour));
                 if(newMap.containsKey(neighbour)){
                     queue.add(neighbour);
                     newMap.remove(neighbour);
                 }
             }
         }
     }


    public static void bfs_makeclone(UndirectedGraphNode node, HashMap<UndirectedGraphNode, UndirectedGraphNode>map){
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            UndirectedGraphNode top = queue.remove();
            UndirectedGraphNode copy = new UndirectedGraphNode(top.label);
            map.put(top,copy);
            for(UndirectedGraphNode neighbour : top.neighbors){
                if(!map.containsKey(neighbour))
                    queue.add(neighbour);
            }
        }
    }
}
