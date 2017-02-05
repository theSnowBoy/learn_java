package algorithmTest.basic.medium.medium_1;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null)
			return new LinkedList<>();
		List<Integer> list = new LinkedList<>();
		list.addAll(inorderTraversal(root.left));
		list.add(root.val);
		list.addAll(inorderTraversal(root.right));
		return list;
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
