/**
 * Created by shilpa on 1/3/2017.
 */
import java.util.Scanner;

public class lonelyInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        maxHeap left = new maxHeap(5005);
        minHeap right = new minHeap(5005);
        float m = 0;
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
            if(left.size == 0 && right.size == 0){
                if(a[a_i] < m) {
                    left.insert(a[a_i]);
                }else{
                    right.insert(a[a_i]);
                }
            }else if (left.size == right.size){
                if(a[a_i] < m){
                    left.insert(a[a_i]);
                }else{
                    right.insert(a[a_i]);
                }
            }else if(left.size > right.size){
                if(a[a_i] < m){
                    int temp = left.getMax();
                    left.remove(temp);
                    left.insert(a[a_i]);
                    right.insert(temp);
                }else{
                    right.insert(a[a_i]);
                }
            }else{
                if(a[a_i] < m){
                    left.insert(a[a_i]);
                }else{
                    int temp = right.getMin();
                    right.remove(temp);
                    left.insert(temp);
                    right.insert(a[a_i]);
                }
            }
            if(left.size == right.size){
                float avg = (float)(left.getMax()+right.getMin())/2;
                m = avg;
                System.out.println(avg);
            }else if(left.size > right.size){
                m  = left.getMax();
                System.out.println((float)left.getMax());
            }else{
                m = right.getMin();
                System.out.println((float)right.getMin());
            }
        }
    }
}
class minHeap{
    int capacity;
    int[] heap;
    int size;
    public minHeap(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public void insert(int x){
        if(this.size < this.capacity){
            this.heap[this.size] = x;
            shiftUp(this.size);
            this.size++;
        }
    };
    public void remove(int x){
        for(int i=0; i<this.size; i++){
            if(this.heap[i] == x){
                swap(i,size-1);
                size--;
                shiftDown(i);
            }
        }
    };
    public boolean isEmpty(){
        if(size <= 0){
            return true;
        }else{
            return false;
        }
    }
    public int getMin(){
        if(!this.isEmpty()){
            return this.heap[0];
        }else{
            return -1;
        }
    };
    private int getParentInd(int childInd){
        return (childInd-1)/2;
    }
    private int getMinChildInd(int parentInd){
        int ind1 = 2*parentInd+1;
        int ind2 = 2*parentInd+2;
        if(ind1 < size && ind2 < size){
            if(this.heap[ind1] > this.heap[ind2]){
                return ind2;
            }else{
                return ind1;
            }
        }else if(ind1 < size){
            return ind1;
        }else{
            return ind2;
        }
    }
    private void swap(int a, int b){
        int temp = this.heap[a];
        this.heap[a] = this.heap[b];
        this.heap[b] = temp;
    }
    private void shiftUp(int ind){
        int parent = this.getParentInd(ind);
        if(parent >= 0 && this.heap[parent] > this.heap[ind]){
            swap(parent,ind);
            shiftUp(parent);
        }
    }
    private void shiftDown(int ind){
        int child = this.getMinChildInd(ind);
        if(child < size && this.heap[ind] > this.heap[child]){
            swap(child,ind);
            shiftDown(child);
        }
    }
    public void print(){
        for(int i=0; i<size; i++){
            System.out.println(this.heap[i]);
        }
    }

}

class maxHeap{
    int capacity;
    int[] heap;
    int size;
    public maxHeap(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public void insert(int x){
        if(this.size < this.capacity){
            this.heap[this.size] = x;
            shiftUp(this.size);
            this.size++;
        }
    };
    public void remove(int x){
        for(int i=0; i<this.size; i++){
            if(this.heap[i] == x){
                swap(i,size-1);
                size--;
                shiftDown(i);
            }
        }
    };
    public boolean isEmpty(){
        if(size <= 0){
            return true;
        }else{
            return false;
        }
    }
    public int getMax(){
        if(!this.isEmpty()){
            return this.heap[0];
        }else{
            return -1;
        }
    };
    private int getParentInd(int childInd){
        return (childInd-1)/2;
    }
    private int getMaxChildInd(int parentInd){
        int ind1 = 2*parentInd+1;
        int ind2 = 2*parentInd+2;
        if(ind1 < size && ind2 < size){
            if(this.heap[ind1] > this.heap[ind2]){
                return ind1;
            }else{
                return ind2;
            }
        }else if(ind1 < size){
            return ind1;
        }else{
            return ind2;
        }
    }
    private void swap(int a, int b){
        int temp = this.heap[a];
        this.heap[a] = this.heap[b];
        this.heap[b] = temp;
    }
    private void shiftUp(int ind){
        int parent = this.getParentInd(ind);
        if(parent >= 0 && this.heap[parent] < this.heap[ind]){
            swap(parent,ind);
            shiftUp(parent);
        }
    }
    private void shiftDown(int ind){
        int child = this.getMaxChildInd(ind);
        if(child < size && this.heap[ind] < this.heap[child]){
            swap(child,ind);
            shiftDown(child);
        }
    }
    public void print(){
        for(int i=0; i<size; i++){
            System.out.println(this.heap[i]);
        }
    }

}



