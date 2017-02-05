package algorithmTest.basic.easy_4;

public class SumofLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
		if(root == null){
			return 0;
		}
		int sum =0;
		if(root.left != null){
			if(root.left.left == null && root.left.right == null ){
				sum += root.left.val;
			}else{
				sum += sumOfLeftLeaves(root.left);
			}
		}
		sum += sumOfLeftLeaves(root.right);
		return sum;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
