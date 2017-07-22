package algorithmTest.basic.easy_3;

public class InvertTree {
	public TreeNode invertTree(TreeNode root) {
		TreeNode tmp ;
		if (root == null) return null;
		tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}

	public class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
