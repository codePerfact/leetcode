/**
 * Created by shilpa on 1/6/2017.
 */
public class mergeSortedArrays {
    public static void main(String[] args){
        int[] arr1 = new int[2];
        arr1[0] = 2;
        arr1[1] = 0;
        int[] arr2 = {1};
        merge(arr1,1,arr2,1);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)
            return;
        else if(m == 0){
            for(int i=0; i<n; i++)
                nums1[i] = nums2[i];
            return;
        }else {
            for(int i=0; i<n; i++){
                int j = 0;
                for(j=0; j<m; j++){
                    if(nums1[j] > nums2[i]){
                        for(int k = m-1; k>=j; k--){
                            nums1[k+1] = nums1[k];
                        }
                        nums1[j] = nums2[i];
                        m++;
                        break;
                    }
                }
                if(j == m) {
                    nums1[m] = nums2[i];
                    m++;
                }

            }
        }


    }
}
