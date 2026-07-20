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
    static class Info{
        int diam;
        int ht;
        public Info(int diam , int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameteroot(TreeNode root){
        if(root == null){
            return new Info(0,0);
     }
        Info leftinfo = diameteroot(root.left);
        Info rightinfo = diameteroot(root.right);
        int dia = Math.max(Math.max(leftinfo.diam , rightinfo.diam),leftinfo.ht+rightinfo.ht);
        int ht = Math.max(leftinfo.ht , rightinfo.ht)+1;
        return new Info(dia,ht);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return (diameteroot(root).diam);
    }
}