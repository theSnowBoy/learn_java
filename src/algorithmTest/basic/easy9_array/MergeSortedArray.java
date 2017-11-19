package algorithmTest.basic.easy9_array;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] help1 = new int[m];
        for(int i = 0 ; i < m ; i++){
        	help1[i] = nums1[i];
        }
        
        int p1=0,p2=0,p3=0;
        while(p1 < m && p2 < n){
        		nums1[p3++] = help1[p1] <= nums2[p2] ? help1[p1++]:nums2[p2++];
        }
        while(p1 < m){
        	nums1[p3++] = help1[p1++];
        }
        while(p2 < n){
        	nums1[p3++] = nums2[p2];
        }
    }
}
