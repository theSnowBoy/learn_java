package algorithmTest.basic.easy_7_tree;

import algorithmTest.basic.easy_7_tree.AverageLevelsBinaryTree.TreeNode;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    	TreeNode result = null ;//复用以往的结点
        if(t1 == null && t2 == null){
        	return null;
        }else if(t1 != null && t2 != null){
        	result = t1;
        	result.val = t1.val + t2.val;
        	result.left = mergeTrees(t1.left, t2.left);
        	result.right = mergeTrees(t1.right, t2.right);
        }else if(t1 != null){
        	result = t1;
        	result.left = mergeTrees(t1.left, null);
        	result.right = mergeTrees(t1.right, null);
        }else{
        	result = t2;
        	result.left = mergeTrees(null, t2.left);
        	result.right = mergeTrees(null, t2.right);
        }
    	return result;
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
