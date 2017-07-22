package algorithmTest.basic.hard_1;

public class FindMedianSortedArrays {

	//TODO
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len = nums1.length + nums2.length;
		int target = len / 2;
		boolean isOdd = (len % 2 != 0);

		int[] numsAll = new int[len];
		for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
			if(nums1[i] < nums2[j]){
				
			}else{
				
			}
		}
		return 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
