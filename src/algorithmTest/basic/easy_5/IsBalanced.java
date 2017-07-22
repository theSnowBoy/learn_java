package algorithmTest.basic.easy_5;

import java.util.HashMap;

public class IsBalanced {
	//TODO ´íÎó
	HashMap<TreeNode, Integer> records = new HashMap<>();

	public boolean isBalanced(TreeNode root) {
		countDepth(root, records);
		return isSubBalanced(root);
	}

	public int countDepth(TreeNode root, HashMap<TreeNode, Integer> records) {
		if (root == null)
			return 0;
		int left = countDepth(root.left, records);
		int right = countDepth(root.right, records);
		int depth = left > right ? left + 1 : right + 1;
		records.put(root, depth);
		return depth;
	}

	public boolean isSubBalanced(TreeNode root) {
		if (root == null)
			return true;

		int currentDiff = (root.left == null ? 0:records.get(root.left))+
				(root.right == null ? 0:records.get(root.right));
		return isBalanced(root.left) && isBalanced(root.right) 
				&& currentDiff < 2;
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
