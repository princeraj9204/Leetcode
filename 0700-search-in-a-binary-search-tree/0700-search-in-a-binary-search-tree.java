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
    public static TreeNode BST(TreeNode root, int val1){
        if(root == null){
            return null;
        }
        if(root.val == val1){
            return root;
        }
        if(root.val > val1){
          return  BST(root.left , val1);
        }else
          return  BST(root.right , val1);
        
       // return null;
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return BST(root , val);
    }
}