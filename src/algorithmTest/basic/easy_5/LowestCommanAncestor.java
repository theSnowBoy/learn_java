package algorithmTest.basic.easy_5;

import algorithmTest.basic.easy_4.SumofLeftLeaves.TreeNode;

public class LowestCommanAncestor {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// root ÊÇ¶þ²æ²éÕÒÊ÷¡£
		if (root == null)
			return null;
		if (root.val > Math.max(p.val, q.val)) {
			TreeNode r = lowestCommonAncestor(root.left, p, q);
			return r;
		} else if (root.val < Math.min(p.val, q.val)) {
			TreeNode l = lowestCommonAncestor(root.right, p, q);
			return l;
		}
		return root;
	}

}
