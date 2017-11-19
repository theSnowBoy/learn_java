package algorithmTest.basic.easy_7_tree;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertBSToGreaterTree {
	public TreeNode convertBST(TreeNode root) {
		if (root == null) {
			return null;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		initQueue(root, queue);
		TreeNode pre = queue.poll();
		TreeNode current = queue.poll();
		while(current != null){
			current.val = current.val + pre.val;
			pre = current;
			current = queue.poll();
		}
		return root;
	}

	public void initQueue(TreeNode root, Queue<TreeNode> queue) {
		if (root == null) {
			return;
		}
		initQueue(root.right, queue);
		queue.add(root);
		initQueue(root.left,queue);
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
