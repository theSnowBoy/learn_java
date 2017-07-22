package algorithmTest.basic.medium.medium_1;

import java.util.LinkedList;
import java.util.Queue;

import algorithmTest.basic.medium.medium_1.BinaryTreeInorderTraversal.TreeNode;

public class CountCompleteTreeNumber {
	public int countNodes(TreeNode root) {
		int height = getHeight(root);
		if(height < 0) return 0;
		if(height-1 == getHeight(root.right)){
			return (1 << height) + countNodes(root.right);
		}else{
			return (1 << (height-1)) + countNodes(root.left);
		}
		
	}
	public int getHeight(TreeNode root){
		//单节点高度为0.
		if(root == null)
			return -1;
		return getHeight(root.left)+1;
	}
}
