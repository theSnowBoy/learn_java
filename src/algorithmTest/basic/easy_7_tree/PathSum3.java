package algorithmTest.basic.easy_7_tree;

import algorithmTest.basic.easy_7_tree.MergeTwoBinaryTrees.TreeNode;

public class PathSum3 {
	public int pathSum(TreeNode root, int sum) {
		if(root == null){
			return 0;
		}
		int pathNum = findTargetCount(root, 0, sum);
		return pathNum + pathSum(root.left, sum) + pathSum(root.right, sum);
	}
	
	public int findTargetCount(TreeNode root,int PathSum,int target){
		if(root == null){
			return 0;
		}
		int count = 0;
		PathSum += root.val;
		if(PathSum == target){
			count ++;
		}
		int left = findTargetCount(root.left, PathSum, target);
		int right = findTargetCount(root.right, PathSum, target);
		return count + left +right;
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
