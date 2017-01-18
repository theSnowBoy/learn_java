package algorithmTest.basic.easy._1;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {

		if (nums == null || nums.length == 0)
			return 0;

		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[count] == nums[i])
				continue;
			nums[++count] = nums[i];
		}

		return ++count;
	}
	
	 public int removeDuplicates2(int[] A) {
		    if (A.length==0) return 0;
		    int j=0;
		    for (int i=0; i<A.length; i++)
		        if (A[i]!=A[j]) A[++j]=A[i];
		    return ++j;
		}
	public static void main(String []args){
		int data[] = {1,1,2};
		System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(data));
	}
}
