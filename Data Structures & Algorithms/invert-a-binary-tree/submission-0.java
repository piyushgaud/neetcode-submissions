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
    public TreeNode invertTree(TreeNode root) {
        return recursive(root);
    }

    private TreeNode recursive(TreeNode cur)
    {
        if(cur==null) return null;
       
    	TreeNode right = recursive(cur.right);
    	TreeNode left = recursive(cur.left);
        cur.left = right;
        cur.right = left;
    	return cur;
    }
}
