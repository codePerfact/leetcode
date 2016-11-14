/**
 * Created by shilpa on 8/26/2016.
 */
public class RemoveDupLL {
    public static void main(String[] args){

    }

    public static void deleteDup(SinglyNode head){
        if(head == null) return;
        SinglyNode previous = head;
        SinglyNode current = previous.next;
        while (current != null){
            SinglyNode runner = head;
            while (runner != current){
                if (runner.value == current.value){
                    previous.next = current.next;
                    current.next = null;
                    current = previous.next;
                    break;
                }
                runner = runner.next;
            }

            previous = current;
            current = current.next;
        }
    }
}
