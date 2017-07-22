package algorithmTest.basic.medium.medium_1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import algorithmTest.basic.easy_4.SumofLeftLeaves.TreeNode;

public class IsValidBST {
	List<TreeNode> orders  = new LinkedList<>();
	public boolean isValidBST(TreeNode root) {
		getTheOrder(root);
		for(int i =0;i <orders.size()-1;i++){
			if(orders.get(i).val >= orders.get(i+1).val){
				return false;
			}
		}
		return true;
	}
	public void getTheOrder(TreeNode root){
		if(root == null) return ;
		getTheOrder(root.left);
		orders.add(root);
		getTheOrder(root.right);
	}
}
