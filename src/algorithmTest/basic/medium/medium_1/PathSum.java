package algorithmTest.basic.medium.medium_1;

import algorithmTest.basic.easy_4.SumofLeftLeaves.TreeNode;

public class PathSum {
	
	public boolean hasPathSum(TreeNode root, int sum) {
		return getResult(root, 0, sum);
	}
	public boolean getResult(TreeNode root,int pre,int sum){
		if(root == null) {
			return false;
		}
		int realSum =  root.val +pre;
		if(root.left == null && root.right == null){
		    return realSum == sum;
		}
		return getResult(root.left, realSum, sum)||getResult(root.right, realSum, sum);
	}

}
