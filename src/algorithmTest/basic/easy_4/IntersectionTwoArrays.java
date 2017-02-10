package algorithmTest.basic.easy_4;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionTwoArrays {
	public int[] intersect(int[] nums1, int[] nums2) {
		ArrayList<Integer> result = new ArrayList<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int p1 = 0;
		int p2 = 0;
		while(p1 <nums1.length && p2 <nums2.length){
			if(nums1[p1] == nums2[p2]){
				result.add(nums1[p1]);
				p1++;
				p2++;
			}else if(nums1[p1] < nums2[p2]){
				p1++;
			}else if(nums1[p1] > nums2[p2]){
				p2++;
			}
		}
		int [] result_final = new int[result.size()];
		for(int i = 0;i<result.size();i++){
			result_final[i] = result.get(i);
		}
		return result_final;
	}
}
