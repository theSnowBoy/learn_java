package algorithmTest.basic.easy_4;

import java.util.ArrayList;
import java.util.List;
import algorithmTest.basic.easy_4.SumofLeftLeaves.TreeNode;

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		//TODO 通过后续遍历的方式记录。
		List<String> paths = new ArrayList<>();
		if(root == null) return paths;
		
		if(root.left == null && root.right == null){
			paths.add(String.valueOf(root.val));
			return paths;
		}
		
		List<String> left = binaryTreePaths(root.left);
		List<String> right = binaryTreePaths(root.right);
		record(left, paths, root);
		record(right,paths,root);
		return paths;
		
	}
	public void record(List<String> src,List<String> tgt,TreeNode current){
		for(String data:src){
			tgt.add(current.val +"->"+data);
		}
	}
}
