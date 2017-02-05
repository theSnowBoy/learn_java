package algorithmTest.basic.medium.medium_1;

public class DeleteNodeInBST {
	public TreeNode deleteNode(TreeNode root, int key) {
		if (root == null)
			return null;
		if(key < root.val){
			root.left = deleteNode(root.left, key);
		}else if(key > root.val){
			root.right = deleteNode(root.right, key);
		}else{
			if(root.left == null){
				return root.right;
			}else if (root.right == null){
				return root.left;
			}
			
			//找最小的来填补。
			TreeNode rightMin = findRightMin(root.right);
			root.val = rightMin.val;
			root.right = deleteNode(root.right, root.val);
			
		}
		return root;
	}

	public TreeNode findRightMin(TreeNode root) {
		while(root.left != null){
			root = root.left;
		}
		return root;
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
