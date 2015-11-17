package Array;

public class ConstructBinaryTreeFromInorderAndPostArrays {

	static class TreeNode{
		int val;
		TreeNode left,right;
		TreeNode(int val){
			this.val = val;
		}
	}
	
	public TreeNode constructBinaryTree(int[] inorder, int[] postorder){
		
		return buildTree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
	}
	
	public TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int posStart, int posEnd){
		if(posStart > posEnd || inStart > inEnd)
			return null;
		
		TreeNode root = new TreeNode(postorder[posEnd]);
		
		
		int index = 0;
		for(int i = inStart; i <= inEnd; i++){
			if(inorder[i] == postorder[posEnd]){
				index = i;
				break;
			}
		}
		
		int len = index - inStart;
		
		root.left = buildTree(inorder, inStart, index-1, postorder, posStart, posStart+len-1);
		root.right = buildTree(inorder,index+1, inEnd, postorder, posStart+len, posEnd-1);
		
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
