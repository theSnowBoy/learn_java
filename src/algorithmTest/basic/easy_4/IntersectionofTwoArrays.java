package algorithmTest.basic.easy_4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionofTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> n1 = new HashSet<>();
		Set<Integer> n2 = new HashSet<>();
		for(int num : nums1){
			n1.add(num);
		}
		for(int num : nums2){
			n2.add(num);
		}
		for(Iterator<Integer> it = n1.iterator();it.hasNext();){
			Integer tmp = it.next();
			if(!n2.contains(tmp)){
				it.remove();
			}
		}
		int out[] = new int[n1.size()];
		int i = 0;
		for(Iterator<Integer> it = n1.iterator();it.hasNext();){
			out[i++] = it.next();
		}
		return out;
	}
}
