package algorithmTest.basic.easy_5;

public class ConstructStringFromBinaryTree {
	public String tree2str(TreeNode t) {
		if(t == null) return "";
		StringBuilder result = new StringBuilder(String.valueOf(t.val));
		String leftResult = tree2str(t.left);
		String rightResult = tree2str(t.right);
		if(leftResult == "" && rightResult == ""){
			return result.toString();
		}else{
			
			if(leftResult == ""){
				result.append("()");
			}else{
                result.append("(");
				result.append(leftResult);
                result.append(")");
			}
			
			
			if(rightResult != ""){
				result.append("(");
				result.append(rightResult);
				result.append(")");
			}
			return result.toString();
			}
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
