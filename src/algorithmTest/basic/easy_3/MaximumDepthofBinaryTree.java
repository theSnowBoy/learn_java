package algorithmTest.basic.easy_3;

public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode node) {
		if(node == null) return 0;
		int left = maxDepth(node.left);
		int right = maxDepth(node.right);
		return (left >= right ? left:right) +1; 
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
