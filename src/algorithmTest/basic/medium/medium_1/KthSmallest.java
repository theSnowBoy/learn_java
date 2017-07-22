package algorithmTest.basic.medium.medium_1;

import algorithmTest.basic.easy_4.SumofLeftLeaves.TreeNode;

public class KthSmallest {
	int count = 0;
	
	public int kthSmallest(TreeNode root, int k) {
		TreeNode tgt = findTreeNode(root, k);
		return tgt.val;
	}

	public TreeNode findTreeNode(TreeNode root,int k){
		if(root == null) return null;
		TreeNode left = findTreeNode(root.left, k);
		if(count == k) return  left;
		if(++count == k) return root;
		return findTreeNode(root.right, k);
		
	}
}
