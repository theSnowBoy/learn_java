package algorithmTest.leetcode_contest.contest48;

public class Test1 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	 private int result = Integer.MAX_VALUE;
	 public int findSecondMinimumValue(TreeNode root) {
	 		if(root == null){
	 			return -1;
	 		}
	 		int min = root.val;
	         helper2(root,min);
	 		return result == Integer.MAX_VALUE ? -1 :result;
	 	}
	 	
	 	public void helper2(TreeNode root,int min){
	 		if(root == null){
	 			return;
	 		}
	 		helper2(root.left,min);
	 		helper2(root.right,min);
	 		if(min < root.val)
	 		{
	 			result = root.val < result?root.val:result;
	 		}
	 	}
}
