package algorithmTest.basic.easy_7_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelsBinaryTree {

	public List<Double> averageOfLevels(TreeNode root) {
		
		List<Double> results =  new ArrayList<>();
		Queue<TreeNode> que = new LinkedList<>();
		//init
		que.add(root);
		int count = 1,tmp_count = count;
		double sum = 0;
		int son_count = 0;
		
		while(!que.isEmpty()){
			TreeNode node = que.poll();
			sum += node.val;
			tmp_count --;
			if(node.left != null){
				son_count ++;
				que.add(node.left);
			}
			if(node.right != null){
				son_count ++;
				que.add(node.right);
			}
			
			if(tmp_count == 0){
				results.add(sum  / count);
				sum  = 0;
				tmp_count = count = son_count;
				son_count = 0;
			}
		}
		
		return results;
	}
	

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
public static void main(String[] args) {
	List<TreeNode> test =  new LinkedList<>();
	test.add(null);
	test.add(null);
	System.out.println(test.size());
	if(test.isEmpty()){
		System.out.println("¿ÕµÄ ~");
	}
}
}
