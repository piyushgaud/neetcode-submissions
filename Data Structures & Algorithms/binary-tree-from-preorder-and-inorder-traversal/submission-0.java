/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public HashMap<Integer, Integer>map = new HashMap();
	private int preOrderIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

       if(preorder==null || inorder==null ||preorder.length != inorder.length) return null;
		
		for(int i=0;i<inorder.length;i++)
		{
			map.put(inorder[i], i);
		}		
        
        return buildT(preorder,0,inorder.length-1);
        
    }

    private TreeNode buildT(int[] preorder, int left, int right)
	{
        if(left>right) return null;
        
		if(preorder.length==0) return null;
		int rootVal = preorder[preOrderIndex];
        preOrderIndex++;
		TreeNode node = new TreeNode(rootVal); 		
		int inOrderIndex = map.get(rootVal);		
		node.left = buildT(preorder,left,inOrderIndex-1);
		node.right = buildT(preorder,inOrderIndex+1,right	);
		return node;
	}
}
