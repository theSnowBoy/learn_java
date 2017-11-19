package algorithmTest.basic.easy_7_tree;

import algorithmTest.basic.easy_7_tree.AverageLevelsBinaryTree.TreeNode;

public class DiameterOfBinaryTree {
	private int max = 0;
	public int diameterOfBinaryTree(TreeNode root) {
		findDiameter(root);
		return max;
	}
	
	public int findDiameter(TreeNode root){
		if(root == null) {
			return 0;
		}
		
		int left =  findDiameter(root.left);
		int right = findDiameter(root.right);
		if(max < left + right){
			max = left +right;
		}
		return (left > right ? left : right)+1;
	}
	
}
