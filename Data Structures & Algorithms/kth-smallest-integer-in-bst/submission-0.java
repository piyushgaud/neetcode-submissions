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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null || k<=0) return 0;
        int count=0;
        ArrayList<Integer> list= new ArrayList<Integer>();
        class Traverse{
            Traverse(TreeNode node)
            {
                if(node.left!=null)
                {
                    new Traverse(node.left);
                }
                list.add(node.val);
                if(node.right!=null)
                {
                    new Traverse(node.right);
                }
            }            
        }
        new Traverse(root);
        if(k<=list.size())
        {
            return list.get(k-1);
        }
        return 0;
    }
}
