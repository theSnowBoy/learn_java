package algorithmTest.basic.easy_4;

import algorithmTest.basic.easy_4.SumofLeftLeaves.TreeNode;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null){
			return true;
		}else if(p != null && q != null && p.val == q.val){
				boolean left = isSameTree(p.left, q.left);
				boolean right = isSameTree(p.right, q.right);
				return left && right;
		}else{
			return false;
		}
	}
}
