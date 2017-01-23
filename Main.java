// Class name must be "Main"

import java.util.ArrayList;
import java.util.List;

class Node{
    int value;
    Node left;
    Node right;
    public Node(int i){
        this.value = i;
        this.left = null;
        this.right = null;
    }
}

class Tree{
    Node root;
    public Tree(){
        this.root = null;
    }
    public void insert(int i){
        _insert(this.root, i);
    }
    public void _insert(Node r, int i){
        Node curr = r;
        if(curr == null)
            curr = new Node(i);
        else if(curr != null && curr.left == null && i < curr.value )
            curr.left = new Node(i);
        else if(curr != null && curr.right == null && i > curr.value)
            curr.right = new Node(i);
        else if(i < curr.value)
            _insert(curr.left,i);
        else
            _insert(curr.right,i);
        List<Integer> list = new ArrayList<Integer>();
        List<List<Integer>> list4 = new ArrayList<List<Integer>>();
    }

    public void delete(Node node){
        if(root == null)
            return;
        Node parent = findParent(node);

        if( parent != null && node.left == null && node.right == null){
            if(parent.left == node)
                parent.left = null;
            else
                parent.right = null;
        }else if(parent != null && node.left != null && parent.right == null){
            if(parent.left == node)
                parent.left = node.left;
            else
                parent.right = node.left;
        }else if(parent != null && node.right != null && node.left == null){
            if(parent.left == node)
                parent.left = node.right;
            else
                parent.right = node.right;
        }else {
            Node succ = inorderSucc(node);
            node.value = succ.value;
            delete(succ);
        }
    }

    public Node findParent(Node node){
        if(root == null || root == node)
            return null;
        else{
            Node parent = root;
            while(parent != null){
                if(parent.left == node || parent.right == node)
                    return parent;
                else if(node.value < parent.value)
                    parent = parent.left;
                else
                    parent = parent.right;
            }
            return parent;
        }

    }

    public Node inorderSucc(Node n){
        Node curr = n;
        if(curr.right != null){
            curr = curr.right;
            while(curr.left != null){
                curr = curr.left;
            }
            return curr;
        }else{
            Node parent = null;
            Node iter = root;
            while(iter != null){
                if(n.value < iter.value){
                    parent = iter;
                    iter = iter.left;
                }else if(n.value > iter.value){
                    iter = iter.right;
                }else{
                    break;
                }
            }
            return parent;
        }
    }

    public Node search(int i){
        Node curr = root;
        while(curr != null && curr.value != i){
            if(i < curr.value)
                curr = curr.left;
            else
                curr = curr.right;
        }
        if(curr != null)
            return curr;
        else
            return null;
    }
    public void print(){
        inorder(this.root);
    }
    public void inorder(Node curr){
        while(curr != null){
            inorder(curr.left);
            System.out.println(curr.value);
            inorder(curr.right);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(1);
        tree.insert(4);
        tree.insert(3);
        tree.insert(2);
        tree.print();
    }
}



