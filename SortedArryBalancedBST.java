/**
 * Created by shilpa on 1/16/2017.
 */
public class SortedArryBalancedBST {
    public static void main(String[] args){
        int[] arr = {1,3};
        TreeNode root = sortedArrayToBST(arr);
        System.out.println();
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return _sortedArrayToBST(nums, 0, nums.length-1);
    }

    public TreeNode sortedListToBST(ListNode head) {
        ListNode start = head;
        int count = 0;
        while (start != null) {
            count++;
            start = start.next;
        }
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i] = head.val;
            head = head.next;
        }
        return _sortedArrayToBST(arr,0,arr.length-1);

    }
    public static TreeNode _sortedArrayToBST(int[] nums, int start, int end){
        if(start > end)
            return null;
        int mid = (start+end)/2;
        TreeNode curr = new TreeNode(nums[mid]);
        curr.left = _sortedArrayToBST(nums,start,mid-1);
        curr.right = _sortedArrayToBST(nums,mid+1,end);
        return curr;
    }
}
