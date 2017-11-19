package algorithmTest.leetcode_contest;

public class EqualTreePartition {
	boolean exits = false;
	public boolean checkEqualTree(TreeNode root) {
		int sum = 0;
		TreeNode p = null;
		sum = sumVal(root);
		if(sum % 2 != 0){
			return false;
		}
		if(root.left == null && root.right == null){
			return false;
		}
		
		 partision(root, sum,sum / 2);
		 return exits;
	}
	
	public int sumVal(TreeNode root){
		if(root == null){
			return 0;
		}
		int leftSum = sumVal(root.left);
		int rightSum =  sumVal(root.right);
		return root.val + leftSum + rightSum;
	}
	
	public int partision(TreeNode root,int rest,int target){
		if(root == null){
			return rest;
		}
		
		int currentRest = partision(root.left, rest,target);
		if(currentRest == target){
			exits =true;
			return currentRest-root.val;
		}
		
		currentRest = currentRest - root.val;
		if(currentRest == target){
			exits =true;
			return currentRest;
		}
		
		return partision(root.right, currentRest,target);
		
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
