import java.util.Arrays;

/**
 * Created by shilpa on 1/7/2017.
 */
public class findMedian {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int N1 = nums1.length;
        int N2 = nums2.length;
        if(N1 < N2) return findMedianSortedArrays(nums2,nums1);
        if(N2 == 0) return ((double)(nums1[(N1-1)/2] + nums1[N1/2]))/2;
        int lo = 0;
        int hi = 2*N2;
        while (lo <= hi){
            int mid2 = (lo+hi)/2;
            int mid1 = N1+N2-mid2;
            double L1 = (mid1 == 0)?Integer.MIN_VALUE:nums1[(mid1-1)/2];
            double L2 = (mid2 == 0)?Integer.MIN_VALUE:nums2[(mid2-1)/2];
            double R1 = (mid1 == N1*2)?Integer.MAX_VALUE:nums1[mid1/2];
            double R2 = (mid2 == N2*2)?Integer.MAX_VALUE:nums2[mid2/2];
            if(L1>R2) lo = mid2+1;
            else if(L2 > R1) hi = mid2-1;
            else return ((double)( Math.max(L1,L2)+Math.min(R1,R2)))/2;
        }
        return -1;
    }
}
