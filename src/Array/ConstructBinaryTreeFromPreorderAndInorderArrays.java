package Array;

public class ConstructBinaryTreeFromPreorderAndInorderArrays {

	static class TreeNode{
		int val;
		TreeNode left,right;
		TreeNode(int val){
			this.val = val;
		}
	}
	
	public TreeNode constructBinaryTree(int[] preorder, int[] inorder){
		
		return buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
	}
	
	public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
		if(preStart > preEnd || inStart > inEnd)
			return null;
		
		TreeNode root = new TreeNode(preorder[preStart]);
		
		
		int index = 0;
		for(int i = inStart; i <= inEnd; i++){
			if(inorder[i] == preorder[preStart]){
				index = i;
				break;
			}
		}
		
		int len = index - inStart;
		
		root.left = buildTree(preorder, preStart+1, preStart+len, inorder, inStart, index-1);
		root.right = buildTree(preorder,preStart+len+1,preEnd, inorder, index+1, inEnd);
		
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
