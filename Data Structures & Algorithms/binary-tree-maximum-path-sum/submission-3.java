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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {        
        if(root==null) return max;        
        Math.max(max,traverse(root));
        return max;
    }

    private int traverse(TreeNode node)
    {
            if(node==null) return 0;
            if(node.left==null && node.right==null) 
            {
                max = Math.max(max, node.val);
                return node.val;
            }
            int leftMax = Math.max(traverse(node.left),0);
            int rightMax = Math.max(traverse(node.right),0);
            max = Math.max(max,node.val+leftMax+rightMax);

            return node.val+Math.max(leftMax,rightMax);
    }
    
}
